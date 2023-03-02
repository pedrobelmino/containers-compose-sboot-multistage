LAB do crescer - devops Aula 3
============================

**Pré-requisitos**
- Maven
- Jdk 11

**No terminal  execute a instrução abaixo para gerar o .jar**
```bash
mvn clean install -DskipTests
```

**No terminal do intellij execute o wsl**
```bash
wsl
```

**Conectado no wsl, construir rodar com docker-compose**
```bash
docker-compose up  --build --force-recreate
```

**Conectado no wsl, conectar no mongo**
```bash
docker exec -it {MONGO_CONTAINER_ID} mongo -u root
use database_filmes
show collections
db.filmes.find()
```

**Para em desenvolvimento rodar apenas mongo, executar no wsl **
```bash
docker-compose run mongodb
```

**Conectado no wsl, forçar remoção dos volumes, networks e containers **
```bash
docker-compose down -v
```

**Faça bom proveito!**

