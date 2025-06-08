# tech_eazy_SatyamadhuBusala_aws_internship
This project was successfully deployed on an AWS EC2 (Amazon Linux) instance as part of an internship assignment. Below are the key steps followed:
## Setup & Deployment Steps
### 1 Launched EC2 Instance
  OS: Amazon Linux 
  Security Group: Port 22 (SSH) & 80 (HTTP) allowed
### 2 Installed Java 19
sudo apt update && sudo apt install openjdk-19-jdk -y
java -version
### 3 Cloned GitHub Repository
git clone https://github.com/techeazy-consulting/techeazy-devops.git
cd techeazy-devops
### 4 Accessed App on Port 80 (HTTP)
Opened http://3.95.37.27 in the browser
![img2](https://github.com/SatyamadhuBusala/tech_eazy_SatyamadhuBusala_aws_internship/blob/main/project%20img/Screenshot%202025-06-08%20094452.png)
Web page displayed "Successfully Deployed"
### 5 Ran the App using Environment Variable
java -Dcustom.message="Hello from Env" -jar target/techeazy-devops-0.0.1-SNAPSHOT.jar
### 6 Instance Shutdown (For Cost Saving)
sudo shutdown now
