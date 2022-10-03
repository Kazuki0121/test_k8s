FROM ubuntu:latest



 
ENV DEBIAN_FRONTEND=noninteractive
 
RUN apt-get update && apt-get install -y tzdata
RUN ln -fs /usr/share/zoneinfo/Asia/Tokyo /etc/localtime
RUN dpkg-reconfigure --frontend noninteractive tzdata
RUN apt-get install -y nginx

WORKDIR /var/www/html

COPY / /var/www/html/
 
CMD ["nginx", "-g", "daemon off;"]
