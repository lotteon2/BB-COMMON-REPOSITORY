package bloomingblooms.domain.aws;

import com.amazonaws.HttpMethod;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import java.util.Date;
import java.util.UUID;

public class PresignedUrlService {
  public String getPresignedUrl(String prefix, String fileName, AmazonS3 amazonS3, String bucket) {
    String onlyOneFileName = onlyOneFileName(fileName);

    GeneratePresignedUrlRequest generatePresignedUrlRequest =
        getGeneratePreSignedUrlRequest(bucket, prefix + "/" + onlyOneFileName);
    return amazonS3.generatePresignedUrl(generatePresignedUrlRequest).toString();
  }

  private GeneratePresignedUrlRequest getGeneratePreSignedUrlRequest(
      String bucket, String fileName) {
    GeneratePresignedUrlRequest generatePresignedUrlRequest =
        new GeneratePresignedUrlRequest(bucket, fileName)
            .withMethod(HttpMethod.PUT)
            .withExpiration(getPreSignedUrlExpiration());
    generatePresignedUrlRequest.addRequestParameter(
        Headers.S3_CANNED_ACL, CannedAccessControlList.PublicRead.toString());
    return generatePresignedUrlRequest;
  }

  private Date getPreSignedUrlExpiration() {
    Date expiration = new Date();
    long expTimeMillis = expiration.getTime();
    expTimeMillis += 1000 * 60 * 5;
    expiration.setTime(expTimeMillis);
    return expiration;
  }

  private String onlyOneFileName(String fileName) {
    return UUID.randomUUID().toString() + fileName;
  }
}
