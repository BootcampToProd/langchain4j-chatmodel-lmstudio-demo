# LangChain4j with LM Studio: Connect to Local LLMs

This repository demonstrates how to connect a LangChain4j Spring Boot application to a local Large Language Model (LLM) served by LM Studio. It utilizes LM Studio's OpenAI-compatible API and a custom HTTP/1.1 configuration to enable you to build private, offline, and zero-cost AI applications right on your machine.

📖 **Complete Guide**: For detailed explanations and a full code walkthrough, read our comprehensive tutorial.<br>
👉 [**Connecting LangChain4j to Local LLMs with LM Studio**](https://bootcamptoprod.com/langchain4j-with-lm-studio/)

🎥 **Video Tutorial**: Prefer hands-on learning? Watch our step-by-step implementation guide.<br>
👉 YouTube Tutorial - Coming soon!!

---

## ✨ What This Project Demonstrates

This application is a practical guide to connecting LangChain4j with AI models that are running locally via LM Studio, covering:

- **LM Studio Integration**: Seamlessly connect your LangChain4j application to the LM Studio local server using the OpenAI-compatible API structure.
- **HTTP/1.1 Configuration**: Learn the essential step of programmatically configuring the JDK HTTP client to force HTTP/1.1, which is required by LM Studio.
- **Private AI Execution**: Run powerful open-source models (like Gemma, Llama 3, or Mistral) completely offline using a highly visual and beginner-friendly GUI.
- **Zero-Cost Development**: Experiment and build with LLMs without worrying about cloud API bills, internet connectivity, or rate limits.

---

## 🛠️ Prerequisites & Setup

To run this application, you will need the following:

1.  **Java 21+ & Maven**: Ensure you have Java 21 and Maven installed on your machine.
2.  **LM Studio**: Install the latest version of LM Studio for your operating system (Windows, Mac, or Linux).
3.  **A Local Model & Running Server**: You must have an LLM (like `google/gemma-3-1b`) downloaded in LM Studio, and the **Local Server must be running** (default port is `1234`).

**For detailed instructions on how to download models and start the local server in LM Studio, please follow the setup guide in our comprehensive article:**<br>
👉 [**Click here for Detailed Instructions**](https://bootcamptoprod.com/?p=5456&preview=true&_thumbnail_id=5464#4-installing-and-setting-up-lm-studio)

---