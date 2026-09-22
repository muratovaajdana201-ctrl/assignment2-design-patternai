# Assignment 2 — Creational Patterns

## 1. Introduction

This assignment focuses on two creational design patterns:
Factory Method and Abstract Factory.

The main goal is to understand how these patterns separate object
creation from client code and reduce direct dependencies on concrete
classes.

For this project, I chose the Music Instruments domain. Factory Method
is used to create individual music instruments, while Abstract Factory
is used to create compatible families of related music products.



## 2. Chosen Domain

The chosen domain for this assignment is Music Instruments.

For Part A, the application creates individual instruments such as
Piano, Guitar, and Drum.

For Part B, the application creates two related product families:
Classical and Rock.

The Classical family contains a Classical Piano and a Piano Case.
The Rock family contains an Electric Guitar and a Guitar Case.



# 3. Factory Method

## 3.1 Structure

The Factory Method pattern is implemented in the factorymethod
package.

MusicInstrument is the Product interface. It defines the play()
method that is implemented by all concrete instruments.

The Concrete Products are:

- PianoMusicInstrument
- GuitarMusicInstrument
- DrumMusicInstrument

MusicInstrumentFactory is the abstract Creator. It declares the
createInstrument() factory method and contains the perform() business
method.

The Concrete Creators are:

- PianoMusicInstrumentFactory
- GuitarMusicInstrumentFactory
- DrumMusicInstrumentFactory

Each Concrete Creator overrides createInstrument() and creates its
corresponding instrument.

## 3.2 UML Diagram

![Factory Method UML Diagram](diagrams/FactoryMethod.png)

The diagram shows the relationship between the Product, Concrete
Products, Creator, and Concrete Creators.

## 3.3 How It Works

The client does not create concrete instruments directly.

Instead, it works with MusicInstrumentFactory. Each concrete factory
decides which instrument should be created.

For example, PianoMusicInstrumentFactory creates a
PianoMusicInstrument, while GuitarMusicInstrumentFactory creates a
GuitarMusicInstrument`.

The perform() method uses the created object through the
MusicInstrument interface.

## 3.4 Advantages

Factory Method separates object creation from the client code.

It is easier to add a new type of instrument because a new Concrete
Product and Concrete Creator can be added without changing the existing
product classes.

The client also does not need to know the details of how a concrete
instrument is created.

## 3.5 Disadvantages

The main disadvantage is that the number of classes can increase.

For every new instrument type, a new product class and usually a new
factory class are needed.

For a very small application, this can make the design more complicated
than necessary.



# 4. Abstract Factory

## 4.1 Structure

The Abstract Factory pattern is implemented in the
abstractfactory package.

There are two Abstract Products:

- MusicInstrument
- InstrumentCase

MusicInstrument defines the play() method, while InstrumentCase
defines the protect() method.

The Concrete Products are:

- ClassicalPiano
- PianoCase
- ElectricGuitar
- GuitarCase

MusicFamilyFactory is the Abstract Factory. It defines two creation
methods:

- createInstrument()
- createCase()

The Concrete Factories are:

- ClassicalMusicFactory
- RockMusicFactory

ClassicalMusicFactory creates the Classical family, while
RockMusicFactory creates the Rock family.

## 4.2 UML Diagram

![Abstract Factory UML Diagram](diagrams/AbstractFactory.png)

The diagram shows how each Concrete Factory creates a complete family
of related products.

## 4.3 Product Families

The Classical family contains:

- ClassicalPiano
- PianoCase

The Rock family contains:

- ElectricGuitar
- GuitarCase

The products from each family are created by the same Concrete Factory,
which keeps the family consistent.

## 4.4 Client and Composition

MusicStudio is the client of the Abstract Factory.

It receives a MusicFamilyFactory through its constructor.

The client depends on the MusicFamilyFactory interface instead of
depending directly on concrete factories or concrete products.

This demonstrates composition because MusicStudio contains a reference
to a MusicFamilyFactory object.

## 4.5 How It Works

The family is selected in one place in the application.

For example:

```java
MusicFamilyFactory factory =
        new ClassicalMusicFactory();

MusicStudio studio =
        new MusicStudio(factory);

studio.prepareMusicSet();
