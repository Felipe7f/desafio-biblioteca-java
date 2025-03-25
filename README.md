# 📚 Sistema de Gerenciamento de Biblioteca em Java

[![NPM](https://img.shields.io/badge/license-MIT-green)](https://github.com/Felipe7f/desafio-biblioteca-java/blob/master/LICENSE)
![Java](https://img.shields.io/badge/Java-17-blue)

## 📌 Sobre o projeto

Sistema completo para gerenciamento de acervo bibliotecário desenvolvido como desafio de programação em Java, com:

- Cadastro e remoção de livros
- Controle de empréstimos e devoluções
- Diversos filtros de busca
- Interface amigável via console

## 🛠️ Funcionalidades

✅ **Cadastro de livros**  
- Título, autor, ano de publicação  
- Categorias pré-definidas (Ficção, Técnico, etc.)  

🔍 **Sistema de buscas**  
- Por título 
- Por categoria  
- Por disponibilidade  

🔄 **Controle de empréstimos**  
- Empréstimo de livros disponíveis  
- Devolução de livros emprestados  
- Status automático de disponibilidade  

📋 **Relatórios**  
- Listagem completa do acervo  
- Listagem filtrada por disponibilidade/categoria  

## 🧠 Conceitos Aplicados

- **POO**: Classes, encapsulamento, composição
- **Enums**: Para categorias de livros
- **Collections**: `ArrayList` para armazenamento
- **StringBuilder**: Manipulação eficiente de strings
- **Tratamento básico de erros**: Validações e mensagens claras

## 📌 O Que Aprendi

- Implementação prática de enums
- Uso de StringBuilder para melhor performance
- Controle de fluxo com menus interativos
- Melhores práticas de organização de código Java

## 📝 Licença

- Este projeto está sob a licença MIT - veja o arquivo [LICENSE](https://github.com/Felipe7f/desafio-biblioteca-java/blob/master/LICENSE) para detalhes.

## 🚀 Como Executar

### Pré-requisitos
- JDK 17+ instalado

### Passo a passo
```bash
# Clone o repositório
git clone https://github.com/Felipe7f/desafio-biblioteca-java.git

# Navegue até o diretório
cd desafio-biblioteca-java

# Compile e execute
javac -d bin src/application/Program.java
java -cp bin application.Program
