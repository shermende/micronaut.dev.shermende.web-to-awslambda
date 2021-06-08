## Micronaut 2.5.5 Documentation

- [User Guide](https://docs.micronaut.io/2.5.5/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.5.5/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.5.5/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Deploy to AWS lambda

```
# build jar
$ ./mvnw clean package
# optional. create role if not exist
$ aws iam create-role --role-name CliAwsLambdaExecutor --assume-role-policy-document file://.aws/role-trust-policy.json
# deploy jar to aws lambda
$ aws lambda create-function --function-name micronaut-aws --zip-file fileb://target/micronaut-web-0.1.jar --handler dev.shermende.controller.HomeController::post --runtime java11 --role "$(aws iam get-role --role-name CliAwsLambdaExecutor | grep Arn | cut -d'"' -f4)"
```

## References

- [Where is my AWS credentials file for CLI](https://aws.amazon.com/blogs/security/wheres-my-secret-access-key/)
- [How to create AWS role CLI way](https://docs.aws.amazon.com/lambda/latest/dg/lambda-intro-execution-role.html)
