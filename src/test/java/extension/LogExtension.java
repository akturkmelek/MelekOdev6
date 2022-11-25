package extension;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class LogExtension implements BeforeEachCallback, AfterEachCallback, BeforeAllCallback,
        AfterAllCallback {

    @Override
    public void afterAll(ExtensionContext extensionContext)  {
        System.out.println("Log afterAll'a girdi");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext)  {
        System.out.println("Log afterEach'e girdi");

    }

    @Override
    public void beforeAll(ExtensionContext extensionContext)  {
        System.out.println("Log beforeAll'a girdi");

    }

    @Override
    public void beforeEach(ExtensionContext extensionContext)  {
        System.out.println("Log beforeEach'e girdi");
    }
}
