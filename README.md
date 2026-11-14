# Advanced Kotlin Concepts — Flows

A single-file exercise project demonstrating Kotlin Flows: builders,
transformation operators, and collection.

## What it covers

- Flow builders: `flow {}`, `flowOf`, `asFlow`, `channelFlow`
- Operators: `map`, `filter`, `take`
- Collecting a flow, including a `simpleFlow()` that emits 1–50 with a 500 ms
  delay between values

## Tech stack

- Kotlin, kotlinx-coroutines (`flow` APIs)
- Android project shell (AppCompat, Material) — the code is a plain Kotlin
  exercise, not a UI app
- Min SDK 29, target SDK 36

## Project structure

```
app/src/main/java/com/example/flowsinkotlin/
└── MainActivity.kt    # Flow demos (top-level main() + simpleFlow())
```

## How to build and run

1. Open the project in Android Studio.
2. Let Gradle sync, then run the `app` configuration on an emulator or a
   physical device (Android 10 / API 29 or higher).
3. The flow demos are plain Kotlin functions — easiest to explore by reading
   the file or running the snippets in a Kotlin scratch file.

## Notes

- A practice exercise, not a finished app: the manifest declares
  `MainActivity`, but the file contains only the flow demos — there is no
  Activity class or UI.
