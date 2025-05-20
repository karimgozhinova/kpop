# Этап 1: Сборка фронтенда
FROM node:18-alpine as build

WORKDIR /app
COPY ./frontend/package*.json ./ 
RUN npm install -g @angular/cli && npm install

COPY ./frontend . 

EXPOSE 4200

CMD ["ng", "serve", "--host", "0.0.0.0", "--port", "4200"]