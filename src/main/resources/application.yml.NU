server:
 port: 8443
 ssl:
    enabled: true
    key-store: classpath:store/keystore.jks
    key-store-password: ${KS_PASSWORD}
    #testing
    key-alias: Ebrahim
    key-password: testing
    #trust-store: classpath:store/truststore.jks
    #trust-store-password: testing
    #client-auth: need
spring:
  profiles:
    include: auth
  security:
    oauth2:
      resourceserver:
        jwt:
          issuer-uri: ${COGNITO_TOKEN}
          #https://cognito-idp.us-east-1.amazonaws.com/us-east-1_dRXRHNfbg
logging:
  level:
    org:
      springframework: DEBUG  