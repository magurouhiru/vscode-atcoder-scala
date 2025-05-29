# 公式イメージを使用
FROM debian:12.11-slim

ARG SCALA_USERNAME
ARG SCALA_USER_UID
ARG SCALA_USER_GID
ARG SCALA_WORKDIR_NAME
ARG SCALA_WORKDIR=/home/${SCALA_USERNAME}/${SCALA_WORKDIR_NAME}

RUN apt-get update \
    && apt-get upgrade -y \
    && apt-get install -y git curl gzip

RUN groupadd --gid ${SCALA_USER_GID} ${SCALA_USERNAME} \
    && useradd --uid ${SCALA_USER_UID} --gid ${SCALA_USER_GID} -m ${SCALA_USERNAME} \
    && mkdir ${SCALA_WORKDIR} \
    && chown -R ${SCALA_USERNAME}:${SCALA_USERNAME} /home/${SCALA_USERNAME}

USER ${SCALA_USERNAME}
WORKDIR ${SCALA_WORKDIR}
RUN curl -fL https://github.com/coursier/coursier/releases/latest/download/cs-x86_64-pc-linux.gz | gzip -d > cs && chmod +x cs && ./cs setup -y
