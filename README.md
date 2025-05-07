# Identifying Network Vulnerability to IP Spoofing

## 📌 Project Overview

This project aims to identify network vulnerabilities to **IP spoofing attacks**, with a focus on enhancing existing **Border Gateway Protocol (BGP)** security mechanisms. While BGP remains the standard routing protocol for inter-domain traffic, its inherent trust-based model leaves it vulnerable to spoofed IP packets. This research introduces an additional encryption-based validation layer using the **AES (Advanced Encryption Standard)** algorithm to mitigate spoofing risks and improve packet authenticity.

## 🔐 Key Features

- **Vulnerability Detection**: Scans and identifies potential entry points in BGP-based routing infrastructure susceptible to spoofed packets.
- **AES Integration**: Encrypts packet metadata using AES for integrity verification at routing nodes.
- **Simulation Environment**: Models network behavior to simulate spoofing scenarios with and without AES-based validation.
- **Logging & Alerts**: Logs suspicious activity and flags potential spoofing attempts in real time.

## 🧠 Background

### What is IP Spoofing?

IP spoofing involves sending IP packets with a forged source address to disguise the origin of the traffic. Attackers can exploit this to bypass firewalls, launch DoS attacks, or redirect traffic through malicious routes.

### Why BGP?

The Border Gateway Protocol is widely used but operates under a trust-based system, accepting routing information without rigorous validation. This makes it a common target for attackers seeking to reroute or disrupt traffic.

## 🛡️ Our Approach

By combining **AES encryption** with BGP, this project introduces a lightweight cryptographic layer to authenticate the source of routing information and data packets. This makes spoofed packets easier to detect and reject, reducing the attack surface significantly.

## 🛠️ Technologies Used

- Programming Language: JSP,servlet
- Runtime:Apache Tomcat Server
- Encryption Standard: AES (Advanced Encryption Standard)


