# 🧱 Dockerized MongoDB + Mongo Express Setup

This guide will help you run a MongoDB database along with Mongo Express (a web-based admin interface) using Docker containers connected via a Docker network.

---

## 📦 Requirements

- Docker installed on your system
- Basic knowledge of Docker commands

---

## 🐳 Step 1: Verify Docker is Working

```bash
docker pull hello-world
docker run hello-world
```

---

## 🧪 Step 2: (Optional) Test with Ubuntu Container

```bash
docker run -it ubuntu
# Inside the container:
exit
```

---

## 🔗 Step 3: Create Docker Network

Create a custom bridge network so MongoDB and Mongo Express can communicate.

```bash
docker network ls
docker network create mongo-network
docker network inspect mongo-network
```

---

## 🗄️ Step 4: Run MongoDB Container

```bash
docker run -d \
  -p 27017:27017 \
  --name mongo \
  --network mongo-network \
  -e MONGO_INITDB_ROOT_USERNAME=admin \
  -e MONGO_INITDB_ROOT_PASSWORD=admin \
  mongo
```

---

## 🌐 Step 5: Run Mongo Express Container

```bash
docker run -d \
  -p 8081:8081 \
  --name mongo-express \
  --network mongo-network \
  -e ME_CONFIG_MONGODB_ADMINUSERNAME=admin \
  -e ME_CONFIG_MONGODB_ADMINPASSWORD=admin \
  -e ME_CONFIG_MONGODB_URL="mongodb://admin:admin@mongo:27017/" \
  mongo-express
```

---

## ✅ Step 6: Test the Setup

- Mongo Express UI: [http://localhost:8081](http://localhost:8081)
- MongoDB runs at: `localhost:27017`

---

## 🛑 Step 7: Stop and Clean Up

```bash
docker stop mongo mongo-express
docker rm mongo mongo-express
```

To remove the network:
```bash
docker network rm mongo-network
```

---

## 📌 Notes

- Mongo Express is a simple UI to view your MongoDB collections and documents.
- The username/password (`admin/admin`) used here is for **local testing only**. Always use strong credentials in production environments.
- This setup is ideal for quick testing and development purposes.

---

Happy Containerizing! 🚢
