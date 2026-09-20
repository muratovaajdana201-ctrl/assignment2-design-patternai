# Assignment 2 - Creational Design Patterns

## Theme

My chosen domain is **Music Instruments**.

The application demonstrates two creational design patterns:

- Factory Method
- Abstract Factory

The goal is to separate object creation from client code and demonstrate the difference between creating one product and creating a family of related products.

---

# Part A - Factory Method

## Purpose

The Factory Method pattern is used to create one type of product: a music instrument.

The client does not directly create concrete instruments such as Piano, Guitar, or Drum.

Instead, object creation is delegated to concrete factory subclasses.

## Product

The Product interface is:

MusicInstrument

It defines the common behavior:

```java
void play();