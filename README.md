## NOTE THE BELOW
# You must ensure the credentials you are using has access to the / virtual host.
# Execute the commands below replacing `YOUR_USERNAME` with the username and `YOUR_PASSWORD` with the password
# Also expose port 5672 which is the AMQP port for rabbitMQ
------------------------------------------------------------------
- rabbitmqctl add_user YOUR_USERNAME YOUR_PASSWORD
- rabbitmqctl set_user_tags YOUR_USERNAME administrator
- rabbitmqctl set_permissions -p / YOUR_USERNAME ".*" ".*" ".*"
------------------------------------------------------------------
#   s i m p l e - r a b b i t - m q 
 
 
