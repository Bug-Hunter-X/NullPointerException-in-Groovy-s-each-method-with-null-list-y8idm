# NullPointerException in Groovy's each method with null list

This repository demonstrates a common error in Groovy where a `NullPointerException` is thrown when using the `each` method on a list that is null.  The `each` method does not perform null checks before iterating.

The `bug.groovy` file contains the erroneous code. The `bugSolution.groovy` file provides a corrected version.

## Problem

The `myMethod` function in `bug.groovy` attempts to iterate over a list, but it doesn't handle the case where the list itself is null. This causes a `NullPointerException` when the `each` method is called on a null object.

## Solution

The solution in `bugSolution.groovy` adds a null check before using the `each` method. This prevents the exception by safely handling the null input.