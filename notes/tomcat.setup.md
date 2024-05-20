Sure, here's a short note summarizing the setup of run configurations for deploying and running a Spring MVC application using Apache Tomcat in IntelliJ IDEA:

1. **Download and Extract Tomcat**:
    - Download Apache Tomcat from the official website and extract the archive to a location on your computer.

2. **Configure Tomcat Server in IntelliJ IDEA**:
    - Open IntelliJ IDEA and navigate to "Settings" > "Build, Execution, Deployment" > "Application Servers".
    - Add Apache Tomcat as a server by specifying the Tomcat installation directory.

3. **Create Run Configuration**:
    - Open the "Run/Debug Configurations" dialog and add a new configuration for Tomcat Server > Local.
    - Configure server settings like port and context path, and specify the artifact to deploy.

4. **Deploy Your Application**:
    - Ensure your Spring MVC application is properly configured.
    - Build your project to generate the WAR file.
    - Deploy the WAR file to Tomcat by running the configured Tomcat run configuration.

5. **Access Your Application**:
    - Once Tomcat is started and your application is deployed, access it by navigating to the appropriate URL in your web browser.

6. **Troubleshooting**:
    - If you encounter permission issues or other errors, ensure that file permissions are set correctly, IntelliJ IDEA is running with necessary privileges, and the Tomcat server configuration is accurate.
      Troubleshooting Permission Issues:
7. **Troubleshooting Permission Issues:**
   - If you encounter permission issues when running Tomcat, ensure that the execute permissions are granted to the `catalina.sh` script (on Unix-like systems) or `catalina.bat` script (on Windows).
   - On Unix-like systems, use the `chmod +x catalina.sh` command to grant execute permission to the script.
   - On Windows, ensure that IntelliJ IDEA is running with administrative privileges to execute scripts.

By following these steps, you can effectively set up and configure run configurations in IntelliJ IDEA to deploy and run your Spring MVC application using Apache Tomcat.