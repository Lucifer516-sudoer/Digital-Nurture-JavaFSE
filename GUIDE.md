# CTS Digital Nurture 5.0 — Java FSE Angular
## 6-Week Deep Skilling Learning Plan
### Harish | Start: 13 June 2026 | Assessment Target: ~25 July 2026

---

> **How to use this plan:**
> - Each day has a **Focus**, **Tasks**, and a **✅ Done?** checkbox placeholder.
> - You are a slow learner — this plan gives you breathing room. Never skip rest days.
> - 1.5–2 hours per day on weekdays. 3–4 hours on weekends. Total ~12 hrs/week.
> - Always **do the hands-on** the same day you read theory. Reading without coding is forgetting.
> - At end of each week, spend 30 min reviewing what felt shaky — write it down on paper.

---

## THE SPINE (Core Concepts Everything Hangs On)

Before you dive in, internalize these 5 load-bearing ideas. Everything else in this program is built on them:

1. **Dependency Injection (DI)** — Spring's entire framework is built around this. Understand it once, deeply. Every bean, service, repository makes sense after this.
2. **HTTP as a Contract** — REST, Controllers, DTOs, and status codes only click when you understand HTTP verbs and request/response as a language.
3. **OOP + Interfaces** — Design patterns, JPA entities, Angular services — all of it assumes you think in interfaces, not implementations.
4. **Layers of an App** — Controller → Service → Repository → Database. This layered mental model applies to every Spring Boot project you'll ever write.
5. **Asynchronous Thinking** — Angular's Observables, HTTP calls, and state management all break if you haven't internalized that the front-end doesn't wait.

---

## RESOURCE STACK

### Tier -1 — Mainstream but genuinely worth it

| Resource                                | Good For                                               | Ceiling                                                                      |
|-----------------------------------------|--------------------------------------------------------|------------------------------------------------------------------------------|
| **Baeldung.com**                        | Spring Boot, JPA, REST — extremely detailed articles   | Not beginner-friendly if you have zero Spring context                        |
| **GeeksForGeeks**                       | Quick concept lookup for DSA, Java, PL/SQL             | Explanations are shallow; use only for reference, not deep understanding     |
| **Javaguides.net**                      | Spring Data JPA + REST CRUD examples with full code    | Not great for the "why" — good only after you already understand the concept |
| **Angular Official Docs (angular.dev)** | Angular v20 components, routing, DI — the actual truth | Dense. Requires prior exposure. Read it second, not first.                   |

### Tier 0 — Foundation Texts (offline-readable books)

These are the ones that serious practitioners actually keep on their machines:

| Book                                                             | Why It's Underrated                                                                                                                                              | Level                 | How to Get It                                                                                       |
|------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------|-----------------------------------------------------------------------------------------------------|
| **Head First Design Patterns** (Freeman & Robson, 2nd Ed.)       | Teaches GoF patterns visually — the SOLID-to-Pattern mental bridge is explicitly drawn here. Most people read blogs and miss the reasoning chain.                | Beginner–Intermediate | Available on Internet Archive (archive.org) — borrow for free. Search "Head First Design Patterns". |
| **Spring Boot: Up & Running** (Mark Heckler)                     | Written by a Spring team member. Covers Boot 3.x from zero to production — Maven, REST, JPA, Actuator all in one coherent narrative.                             | Intermediate          | O'Reilly — free via many college library portals. Also check Anna's Archive.                        |
| **RESTful Web Services** (Richardson & Ruby)                     | The authors made it freely downloadable at restfulwebapis.org. Explains REST properly — not just "use GET/POST". Essential before you write a single controller. | Beginner–Intermediate | Free PDF: http://restfulwebapis.org/rws.html                                                        |
| **Effective Java** (Joshua Bloch, 3rd Ed.)                       | The single best Java book ever written. Items 15–22 alone will make your Spring code better. Not for cover-to-cover reading — use as a reference.                | Intermediate          | Buy it. Or find it on library Genesis. One of those books worth owning.                             |
| **Angular - Notes for Professionals** (Stack Overflow Community) | Free. Covers components, directives, routing, HTTP, forms. Compiled from SO documentation — dense and practical.                                                 | Beginner–Intermediate | Free PDF: https://goalkicker.com/AngularBook/                                                       |
| **Docker Deep Dive** (Nigel Poulton)                             | The cleanest intro to Docker that exists. 200 pages, covers everything in the handbook.                                                                          | Beginner              | Cheap on Amazon. PDF preview exists via publisher's site.                                           |

### Tier 1 — Living Curriculum (where practitioners actually learn)

**YouTube Channels (watch, don't just play):**

| Channel                            | What They Cover                                     | Why They're Worth It                                                                            |
|------------------------------------|-----------------------------------------------------|-------------------------------------------------------------------------------------------------|
| **Java Brains** (Koushik Kothagal) | Spring Boot, Spring Security, OAuth, Microservices  | The "why" behind every concept is explained. Not just copy-paste tutorials.                     |
| **Amigoscode**                     | Spring Boot + Angular full stack, Docker, TDD       | Full-stack walkthroughs that mirror exactly what CTS expects. Very structured.                  |
| **Daily Code Buffer**              | Spring Boot Microservices, REST APIs                | Underrated Indian channel. Deep Spring Cloud coverage.                                          |
| **Telusko** (Navin Reddy)          | Java fundamentals, Spring, Hibernate                | Fast-paced. Good for concept revisits. Tamil-adjacent teaching style — you'll feel comfortable. |
| **The Net Ninja**                  | Angular v20, TypeScript, RxJS                       | Best Angular series for someone new to the framework. Small steps, logical order.               |
| **Fireship**                       | GenAI, Docker, Git concepts — 100-second explainers | Best for platform/DevOps overview. Watch before a module, not during.                           |

**GitHub Repos (clone these, read the code):**
- `https://github.com/spring-projects/spring-petclinic` — Official Spring Boot reference app. Real production-style code.
- `https://github.com/gothinkster/realworld` — Full-stack app implemented in Spring + Angular. See how layers talk to each other.
- `https://github.com/in28minutes/spring-microservices-v3` — Ranga Karanam's microservices repo. Mirrors the handbook content exactly.

**Communities:**
- `r/learnjava` and `r/javahelp` — For when you're stuck. Don't ask "explain this to me" — ask "why does X behave this way?"
- **Baeldung Newsletter** — Subscribe. Weekly real-world Spring articles. Not SEO fluff.

### Tier 2 — Hidden Syllabus

| Resource                                                                | What For                                                                                                                |
|-------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| **Spring's Official "Getting Started" Guides** (start.spring.io guides) | The official, curated tutorials — most people skip these and go to YouTube. Don't. These are short, dense, and correct. |
| **freeCodeCamp YouTube — "Spring Boot Full Course"** (4 hrs, Nelson)    | If you need a single video that covers 60% of the handbook, this is it. Watch at 1.25x.                                 |
| **TechPrimers (YouTube)**                                               | Microservices patterns, Docker, CI/CD. Small channel. Very high signal.                                                 |
| **roadmap.sh/java**                                                     | Visual roadmap — use it to know what you've covered vs what's left.                                                     |

### Tier 3 — Contrarian Reads (challenge the mainstream)

- **"Goodbye Microservices"** (Segment.com blog post, freely available) — A real company explaining why they moved FROM microservices BACK to a monolith. Read this before Module 8 so you understand *when* microservices are overkill, not just what they are.
- **"The Twelve-Factor App"** (12factor.net) — Free website. 12 principles for building real software. Every Spring Boot + Docker + CI/CD concept maps to one of these factors. Read it on a rest day.

---

## THE PLATEAU WARNING

Most people stall at **Spring IoC/DI** and again at **Angular Observables**. Here's what actually happens:

- **Spring plateau**: You copy-annotate (`@Service`, `@Autowired`, `@Repository`) without understanding the container. Fix: draw the object graph on paper. Who creates what? Who injects into whom? Do this for every project.
- **Angular plateau**: RxJS Observables feel alien. Fix: don't learn RxJS in isolation. Learn it through Angular's HttpClient. One real HTTP call with `.subscribe()` teaches more than 3 hours of theory.

---

## 6-WEEK DAY-WISE PLAN

### Legend
- 📖 = Read/Watch theory
- 💻 = Code hands-on
- 🔁 = Review / Quiz
- 😴 = Rest day (mandatory — your brain consolidates during rest)
- ✅ = Mark done when completed

---

### WEEK 1 — Engineering Concepts (14 Jun – 20 Jun)
**Theme: Design Patterns + DSA. These are the permanent foundations.**

---

#### Day 1 — Saturday, 14 Jun
**Focus: SOLID Principles — the "why" before the "what"**

- 📖 Read: https://www.baeldung.com/solid-principles (full article, take notes)
- 📖 Watch: Java Brains — "SOLID Principles Explained" (YouTube search)
- 💻 Write Java code for each principle: One class per principle, written from scratch (not copied)
- 🔁 Without looking at notes, write the full form of SOLID and one line on what each prevents

**✅ Done?** [ ]

---

#### Day 2 — Sunday, 15 Jun
**Focus: GoF Design Patterns — Creational group**

- 📖 Read Head First Design Patterns Chapter 1 (Strategy pattern) + Chapter 3 (Decorator)
- 📖 Read: Singleton, Factory Method, Builder — baeldung.com (search each)
- 💻 Implement Singleton (thread-safe), Factory Method, Builder in Java — from memory after reading
- 🔁 Answer: When would you use Builder over Constructor? Write 3 lines.

**✅ Done?** [ ]

---

#### Day 3 — Monday, 16 Jun
**Focus: GoF Design Patterns — Structural + Behavioral**

- 📖 Read: Adapter, Decorator, Proxy — baeldung.com
- 📖 Read: Observer, Strategy, Command — baeldung.com
- 💻 Implement Observer pattern (event system), Strategy pattern (sorting strategy)
- 🔁 Quiz: https://www.baeldung.com/java-design-patterns-interview-questions (read questions, answer mentally)

**✅ Done?** [ ]

---

#### Day 4 — Tuesday, 17 Jun
**Focus: DSA — Big-O + Arrays + Sorting**

- 📖 Read: https://www.geeksforgeeks.org/design-and-analysis-of-algorithms/ (Big-O section only)
- 📖 Read: Array data structure guide — GFG
- 💻 Implement: Bubble Sort, Insertion Sort, Merge Sort, Quick Sort in Java (from scratch, no copying)
- 🔁 For each sort: write the time complexity (best/avg/worst) on paper

**✅ Done?** [ ]

---

#### Day 5 — Wednesday, 18 Jun
**Focus: DSA — Linked Lists + Searching**

- 📖 Read: https://www.geeksforgeeks.org/linked-list-in-java/ (Single + Double)
- 💻 Implement: Single Linked List with insert, delete, traverse, search — from scratch
- 💻 Implement: Binary Search + Linear Search on an array
- 🔁 Quiz: https://www.geeksforgeeks.org/quiz-ds/ (take the DSA quiz)

**✅ Done?** [ ]

---

#### Day 6 — Thursday, 19 Jun
**Focus: MVC + Dependency Injection pattern — bridge into Spring**

- 📖 Read: MVC pattern — GFG article
- 📖 Read: Dependency Injection concept — baeldung.com/inversion-control-and-dependency-injection-in-spring
- 💻 Write a plain Java app (no Spring) that manually does DI — constructor injection
- 🔁 Write: What problem does DI solve? What would happen without it? (3–5 lines)

**✅ Done?** [ ]

---

#### Day 7 — Friday, 20 Jun
**Focus: Week 1 Review**

- 🔁 Design Patterns Quiz: https://www.geeksforgeeks.org/software-engineering/quiz-on-design-patterns/
- 🔁 DSA Quiz: https://www.geeksforgeeks.org/quiz-ds/
- 💻 Mini challenge: Implement a simple logging system using the Observer pattern in Java
- 😴 Evening: rest. You've done 6 straight days. Good work.

**✅ Done?** [ ]

---

### WEEK 2 — PL/SQL + TDD + Logging (21 Jun – 27 Jun)
**Theme: The programming language layer. SQL is permanent. TDD is a mindset.**

---

#### Day 8 — Saturday, 21 Jun
**Focus: PL/SQL — What it is + Block Structure + Variables**

- 📖 Read: https://www.geeksforgeeks.org/plsql-introduction/
- 📖 Read: https://www.educba.com/pl-sql-block-structure/
- 📖 Read: https://www.tutorialspoint.com/plsql/plsql_basic_syntax.htm
- 💻 Practice: Write 5 anonymous PL/SQL blocks — declare variables, use IF/THEN/ELSE, print output
- 🔁 Write: What is the difference between SQL and PL/SQL? (4–5 lines)

**✅ Done?** [ ]

---

#### Day 9 — Sunday, 22 Jun
**Focus: PL/SQL — Cursors, Procedures, Functions**

- 📖 Read: Cursors — tutorialspoint.com/plsql/plsql_cursors.htm
- 📖 Read: Procedures and Functions — Oracle docs (link in handbook)
- 💻 Practice: Write a stored procedure that takes a name and prints a greeting; write a function that returns a calculated value
- 💻 Practice: Write a cursor that iterates over a result set and processes each row

**✅ Done?** [ ]

---

#### Day 10 — Monday, 23 Jun
**Focus: PL/SQL — Packages, Triggers + Quiz**

- 📖 Read: Packages — Oracle docs (link in handbook)
- 📖 Read: Triggers — Oracle docs (link in handbook)
- 💻 Practice: Write a BEFORE INSERT trigger on a sample table
- 🔁 Quiz: PL/SQL Quiz (link in handbook)
- 🔁 Error Handling: Read the error handling Oracle doc; write a block that handles a custom exception

**✅ Done?** [ ]

---

#### Day 11 — Tuesday, 24 Jun
**Focus: TDD Fundamentals + JUnit 5 Setup**

- 📖 Read: https://www.geeksforgeeks.org/test-driven-development-tdd/
- 📖 Read: https://www.geeksforgeeks.org/introduction-to-junit-5/
- 💻 Set up a Maven project with JUnit 5 dependency in pom.xml
- 💻 Write your first 5 JUnit tests for a simple Calculator class (add, subtract, multiply, divide, divide-by-zero exception)
- 🔁 Practice the AAA pattern: Arrange → Act → Assert — label each section in your test code

**✅ Done?** [ ]

---

#### Day 12 — Wednesday, 25 Jun
**Focus: Mockito + Advanced JUnit**

- 📖 Read: https://www.javacodegeeks.com/mockito-tutorials
- 💻 Create a service that depends on a repository; mock the repository using Mockito
- 💻 Write tests using `@Mock`, `@InjectMocks`, `when().thenReturn()`, `verify()`
- 💻 Write a parameterized test using `@ParameterizedTest` and `@ValueSource`

**✅ Done?** [ ]

---

#### Day 13 — Thursday, 26 Jun
**Focus: SLF4J + Lombok**

- 📖 Read: https://www.tutorialspoint.com/slf4j/index.htm (full article)
- 📖 Read: https://www.baeldung.com/intro-to-project-lombok
- 💻 Add SLF4J to your Maven project; replace all `System.out.println` with logger calls at correct levels (INFO, WARN, ERROR, DEBUG)
- 💻 Add Lombok to your project; refactor your model classes to use `@Data`, `@Builder`, `@Slf4j`
- 🔁 Write: Why is `@Slf4j` from Lombok better than manually creating a Logger? (3 lines)

**✅ Done?** [ ]

---

#### Day 14 — Friday, 27 Jun
**Focus: Week 2 Review + Practice**

- 🔁 Take the PL/SQL Quiz from handbook
- 🔁 Re-run your JUnit tests — make one intentionally fail, understand the error message
- 💻 Write a new class (e.g., a Student grade calculator) using full TDD cycle: write failing test → write code → make it pass → refactor
- 😴 Evening off.

**✅ Done?** [ ]

---

### WEEK 3 — Spring Core, Maven, JPA, Hibernate (28 Jun – 4 Jul)
**Theme: The backbone of every Java enterprise app. This is the hardest week. Slow down here.**

---

#### Day 15 — Saturday, 28 Jun
**Focus: Spring Framework Overview + Maven**

- 📖 Read: https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/overview.html
- 📖 Read: Maven setup — https://www.studytonight.com/spring-framework/spring-maven-project
- 💻 Create your first Maven project using Spring Initializr (start.spring.io): select Spring Web, Spring Data JPA, H2 Database
- 💻 Understand what each file in the generated project does (pom.xml, application.properties, main class)
- 🔁 Write: What does `@SpringBootApplication` do? (3 lines — look it up)

**✅ Done?** [ ]

---

#### Day 16 — Sunday, 29 Jun
**Focus: Spring IoC Container + Bean Configuration**

- 📖 Read: https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring
- 📖 Read: https://www.baeldung.com/spring-bean-annotations
- 💻 Create beans using `@Component`, `@Service`, `@Repository`
- 💻 Inject them using `@Autowired` (constructor injection — preferred) and field injection
- 💻 Create a `@Configuration` class with a `@Bean` method
- 🔁 Watch: Java Brains "Spring IoC" — the container explanation (YouTube)

**✅ Done?** [ ]

---

#### Day 17 — Monday, 30 Jun
**Focus: Spring AOP + Spring MVC**

- 📖 Read: https://www.geeksforgeeks.org/aspect-oriented-programming-and-aop-in-spring-framework/
- 📖 Read: https://www.geeksforgeeks.org/spring-mvc-framework/
- 💻 Write a simple AOP aspect that logs method entry and exit using `@Before` and `@After`
- 💻 Create a basic `@RestController` that returns "Hello World" as JSON — verify it with a browser/curl
- 🔁 Quiz: Maven Quiz + Spring Quiz from handbook

**✅ Done?** [ ]

---

#### Day 18 — Tuesday, 1 Jul
**Focus: Spring Data JPA — Setup + Entity Mapping**

- 📖 Read: https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa
- 📖 Read: Entity mapping article from handbook (salithachathuranga medium article)
- 💻 Create a `Student` entity with `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@Column`
- 💻 Create a `StudentRepository` extending `JpaRepository<Student, Long>`
- 💻 Write a `CommandLineRunner` that saves 3 students and fetches them back — verify in H2 console

**✅ Done?** [ ]

---

#### Day 19 — Wednesday, 2 Jul
**Focus: CRUD + Query Methods + Pagination**

- 📖 Read: Spring Data JPA CRUD — medium.com/javarevisited (link in handbook)
- 📖 Read: Query methods — docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
- 📖 Read: Pagination — https://www.baeldung.com/spring-data-jpa-pagination-sorting
- 💻 Add custom query methods to your repository: `findByName`, `findByAgeBetween`
- 💻 Implement pagination: return a `Page<Student>` from a controller endpoint
- 🔁 Quiz: Spring Data JPA Quiz from handbook

**✅ Done?** [ ]

---

#### Day 20 — Thursday, 3 Jul
**Focus: Hibernate-specific features + SonarQube overview**

- 📖 Read: JPA + Hibernate article from handbook (medium @burakk)
- 📖 Read: SonarQube intro — https://www.geeksforgeeks.org/devops/sonarqube/
- 💻 Add `@CreatedDate`, `@LastModifiedDate` auditing to your entity; enable `@EnableJpaAuditing`
- 💻 (Optional if local setup available) Run a SonarQube scan on your project and read the report
- 🔁 Write: What is "code smell"? Name 3 examples from your own code.

**✅ Done?** [ ]

---

#### Day 21 — Friday, 4 Jul
**Focus: Week 3 Review**

- 🔁 Re-trace the flow: HTTP Request → Controller → Service → Repository → DB → back
- 💻 Build a mini Student Management API: add, list, delete endpoints using Spring Boot + JPA + H2
- 🔁 Hibernate Quiz + Spring Data JPA Quiz from handbook
- 😴 Evening off.

**✅ Done?** [ ]

---

### WEEK 4 — Spring REST + Microservices (5 Jul – 11 Jul)
**Theme: Making your backend talk to the outside world. This is where it all connects.**

---

#### Day 22 — Saturday, 5 Jul
**Focus: REST Architecture + Building REST Controllers**

- 📖 Read: https://www.geeksforgeeks.org/spring-boot-introduction-to-restful-web-services/
- 📖 Read: Free book — RESTful Web Services (Richardson & Ruby) — Chapter 1 only
- 💻 Build a full REST API for your Student entity: GET all, GET by ID, POST, PUT, DELETE
- 💻 Use `@RestController`, `@RequestMapping`, `@PathVariable`, `@RequestBody`
- 🔁 Test all endpoints with curl or Postman/HTTPie

**✅ Done?** [ ]

---

#### Day 23 — Sunday, 6 Jul
**Focus: DTOs + Exception Handling + Validation**

- 📖 Read: DTOs and REST design — moesif.com article (handbook)
- 📖 Read: Request validation — medium @tericcabrel (handbook link)
- 💻 Create a `StudentDTO` separate from your entity; map entity → DTO in service layer
- 💻 Add `@Valid` + Jakarta validation annotations (`@NotNull`, `@Size`, `@Email`) to your DTO
- 💻 Add a `@ControllerAdvice` class with `@ExceptionHandler` for 404 and validation errors

**✅ Done?** [ ]

---

#### Day 24 — Monday, 7 Jul
**Focus: Spring Security + JWT basics**

- 📖 Read: https://www.toptal.com/spring/spring-boot-oauth2-jwt-rest-protection
- 📖 Read: https://www.geeksforgeeks.org/json-web-token-jwt/
- 💻 Add Spring Security dependency; configure basic HTTP auth first (simplest)
- 💻 Read about JWT structure (header.payload.signature) — write it on paper from memory
- 🔁 Quiz: REST Quiz from handbook

**✅ Done?** [ ]

---

#### Day 25 — Tuesday, 8 Jul
**Focus: Microservices — What, Why, When**

- 📖 Read: Microservices intro — https://www.geeksforgeeks.org/microservices/
- 📖 Read: **"Goodbye Microservices"** blog post (search "Segment goodbye microservices") — contrarian read
- 📖 Read: Circuit Breaker pattern — GFG link in handbook
- 🔁 Write: When should you NOT use microservices? (your own words, 5 lines)
- 🔁 Watch: Daily Code Buffer "Microservices with Spring Boot" — first 30 min only

**✅ Done?** [ ]

---

#### Day 26 — Wednesday, 9 Jul
**Focus: Spring Cloud — Eureka + API Gateway**

- 📖 Read: https://www.geeksforgeeks.org/what-is-spring-cloud/
- 📖 Read: Spring Cloud Netflix Eureka — handbook link (howtodoinjava)
- 💻 Set up 2 Spring Boot services; register both with Eureka; call one from the other using RestTemplate or Feign
- 📖 Read: API Gateway patterns — handbook link

**✅ Done?** [ ]

---

#### Day 27 — Thursday, 10 Jul
**Focus: Spring Security for Microservices + OAuth2 overview**

- 📖 Read: OAuth2 workflow — https://www.geeksforgeeks.org/workflow-of-oauth-2-0/
- 📖 Read: SSO in microservices — GFG link in handbook
- 💻 Add Spring Security to your microservice; test that unauthenticated requests are rejected
- 🔁 Read: "The Twelve-Factor App" — https://12factor.net (skim: factors 3, 4, 6, 10 are most relevant)

**✅ Done?** [ ]

---

#### Day 28 — Friday, 11 Jul
**Focus: Week 4 Review**

- 🔁 Draw on paper: A full microservice architecture with Eureka, API Gateway, 2 services, and a DB each
- 🔁 Microservices Quiz from handbook
- 💻 Swagger/OpenAPI: Add springdoc-openapi dependency; verify auto-generated docs at /swagger-ui.html
- 😴 Evening off.

**✅ Done?** [ ]

---

### WEEK 5 — Angular v20 (12 Jul – 18 Jul)
**Theme: The front-end world. If you've never done TypeScript, slow down. It's different from Python.**

---

#### Day 29 — Saturday, 12 Jul
**Focus: Angular Environment + First Component**

- 📖 Read Angular Notes for Professionals PDF (goalkicker.com/AngularBook) — Ch 1–3
- 💻 Install Node.js + Angular CLI: `npm install -g @angular/cli`
- 💻 `ng new student-app` — run it, see it in the browser
- 💻 Create your first component: `ng generate component student-list`
- 🔁 Watch: The Net Ninja "Angular Tutorial for Beginners" — first 3 episodes

**✅ Done?** [ ]

---

#### Day 30 — Sunday, 13 Jul
**Focus: Data Binding + Component Lifecycle**

- 📖 Read: Component lifecycle — GFG angular tutorial (handbook)
- 💻 Practice all 4 binding types in a single component:
  - Property binding: `[src]="imageUrl"`
  - Event binding: `(click)="onClick()"`
  - Two-way binding: `[(ngModel)]="name"`
  - Interpolation: `{{ name }}`
- 💻 Implement `ngOnInit` to load data when component initialises
- 💻 Use `@Input` and `@Output` to communicate between a parent and child component

**✅ Done?** [ ]

---

#### Day 31 — Monday, 14 Jul
**Focus: Directives + Pipes + Forms**

- 📖 Read: GFG Angular directives (handbook link)
- 💻 Use `*ngIf`, `*ngFor`, `*ngSwitch` in your templates
- 💻 Build a Template-Driven Form with validation (`required`, `minlength`)
- 💻 Build a Reactive Form using `FormBuilder`, `FormGroup`, `FormControl`
- 🔁 Write: When would you use Reactive Forms over Template-Driven? (3 lines)

**✅ Done?** [ ]

---

#### Day 32 — Tuesday, 15 Jul
**Focus: Services + Dependency Injection + Routing**

- 📖 Read: Angular DI — tutorialspoint angular DI (handbook)
- 💻 Create a `StudentService` with `@Injectable({providedIn: 'root'})`
- 💻 Set up routing: 3 routes — list, detail, add — using Angular Router
- 💻 Use `RouterLink`, `ActivatedRoute` to pass and read route parameters
- 💻 Add a route guard (`CanActivate`) that checks if a condition is met before allowing navigation

**✅ Done?** [ ]

---

#### Day 33 — Wednesday, 16 Jul
**Focus: HttpClient + API Integration + RxJS**

- 📖 Read: GFG Angular HTTP interceptors (handbook)
- 💻 Add `HttpClientModule`; connect your Angular app to your Spring Boot REST API
- 💻 Fetch students from `/api/students`, display in a list using `*ngFor`
- 💻 POST a new student from your Reactive Form to the backend
- 💻 Add an HTTP Interceptor that logs every request

**✅ Done?** [ ]

---

#### Day 34 — Thursday, 17 Jul
**Focus: State Management + RxJS Operators**

- 📖 Read: State management basics — GFG angular (handbook)
- 📖 Read: RxJS operators — map, filter, switchMap, catchError (GFG angular cheat sheet)
- 💻 Use `BehaviorSubject` in your service to share state across components
- 💻 Chain `.pipe(map(), catchError())` on an HTTP call
- 🔁 Angular Quiz: https://www.javaguides.net/2023/09/angular-quiz.html

**✅ Done?** [ ]

---

#### Day 35 — Friday, 18 Jul
**Focus: Week 5 Review + Debugging**

- 💻 Debug your app using Chrome DevTools — set a breakpoint in the Sources panel on a TypeScript file
- 💻 Debug using VS Code Angular debugger (create launch.json)
- 🔁 Angular Quiz: https://www.w3schools.com/angular/angular_quiz.asp
- 💻 Write unit tests for your StudentService using Jasmine + TestBed
- 😴 Evening off.

**✅ Done?** [ ]

---

### WEEK 6 — Platforms (GIT, Docker, CI/CD, Cloud, GenAI) + Full Review (19 Jul – 25 Jul)
**Theme: The delivery layer. These are "awareness" modules — understand concepts, not deep implementation.**

---

#### Day 36 — Saturday, 19 Jul
**Focus: Git — Complete**

- 📖 Read: https://www.geeksforgeeks.org/git-tutorial/ (full)
- 💻 Practice in a real repo: init, add, commit, push, branch, merge, handle a conflict deliberately
- 💻 Fork a public GitHub repo; make a change; open a pull request
- 🔁 Write the Git Flow workflow on paper (feature branch → dev → main)

**✅ Done?** [ ]

---

#### Day 37 — Sunday, 20 Jul
**Focus: Docker — Concepts + Basic Commands**

- 📖 Read: https://www.geeksforgeeks.org/docker-tutorial/ (full)
- 📖 Read Docker Deep Dive (Nigel Poulton) — Chapters 1–5 if you have access
- 💻 Pull an image: `docker pull openjdk:17`
- 💻 Write a Dockerfile for your Spring Boot app; build and run it
- 💻 Write a `docker-compose.yml` that runs your app + a PostgreSQL container together
- 🔁 Quiz: Docker Quiz from handbook

**✅ Done?** [ ]

---

#### Day 38 — Monday, 21 Jul
**Focus: DevOps + CI/CD + Agile**

- 📖 Read: DevOps intro — https://www.geeksforgeeks.org/devops-tutorial/
- 📖 Read: CI/CD — https://www.geeksforgeeks.org/what-is-ci-cd/
- 📖 Read: Agile Manifesto — https://www.atlassian.com/agile
- 📖 Read: Scrum roles + ceremonies — https://www.atlassian.com/agile/scrum
- 🔁 Write: What is the difference between CI and CD? (4 lines) What is a Sprint? (3 lines)
- 🔁 DevOps Quiz from handbook

**✅ Done?** [ ]

---

#### Day 39 — Tuesday, 22 Jul
**Focus: Cloud Fundamentals — AWS Core Concepts**

- 📖 Read: https://www.freecodecamp.org/news/beginners-guide-to-cloud-computing-with-aws/
- 📖 Read: EC2, S3, VPC overviews — GFG aws-tutorial (handbook links)
- 📖 Read: AWS Lambda + API Gateway — GFG links (handbook)
- 🔁 Write: Difference between IaaS, PaaS, SaaS — one real example of each (3 lines each)
- 🔁 Write: When would you use Lambda over EC2?

**✅ Done?** [ ]

---

#### Day 40 — Wednesday, 23 Jul
**Focus: GenAI Fundamentals + GitHub Copilot**

- 📖 Read: https://www.geeksforgeeks.org/what-is-generative-ai/
- 📖 Read: Prompt Engineering — https://www.promptingguide.ai/ (Introduction section)
- 📖 Read: GitHub Copilot — GFG link (handbook)
- 💻 If you have Copilot access: generate a REST endpoint from a comment, review what it produced critically
- 🔁 Quiz: https://www.mygreatlearning.com/blog/generative-ai-quiz/
- 🔁 Write: 3 risks of AI-generated code (from the handbook's security section)

**✅ Done?** [ ]

---

#### Day 41 — Thursday, 24 Jul
**Focus: Full Mock Review — All Modules**

- 🔁 Go through every module's "Check Your Understanding" quiz (all from handbook)
- 🔁 Cover sheet: write on paper the 3 most important things from each module (without looking at notes)
- 💻 Final hands-on: Build a mini full-stack app — Angular form → Spring REST API → JPA → H2 — end-to-end, no tutorials, from memory
- 🔁 Where you fail: mark it. Spend tomorrow fixing those gaps.

**✅ Done?** [ ]

---

#### Day 42 — Friday, 25 Jul
**Focus: Final Gap-Fill + Rest**

- 💻 Fix every marked gap from Day 41
- 🔁 Re-take any quiz you scored below 70% on
- 🔁 Read the assessment completion criteria again (hands-on mandatory, KBA covers all modules)
- 😴 Rest by evening. You're ready.

**✅ Done?** [ ]

---

## WEEKLY CHECKPOINTS

At the end of each week, ask yourself these before moving forward:

| Week   | Pass Signal                                                                                    |
|--------|------------------------------------------------------------------------------------------------|
| Week 1 | Can you implement the Observer pattern and Merge Sort from memory in 20 min?                   |
| Week 2 | Can you write a JUnit test with Mockito for a service that has a repository dependency?        |
| Week 3 | Can you build a Spring Boot app with JPA from scratch — no guides — in under 1 hour?           |
| Week 4 | Can you explain what Eureka does and why you need it, without looking at notes?                |
| Week 5 | Can you connect Angular to a REST API and display data, from scratch?                          |
| Week 6 | Can you explain the difference between a Docker image and a container, and write a Dockerfile? |

If you fail a checkpoint — **do not move forward**. Spend one extra day on that module.

---

## ANTI-PATTERN WARNING

You are self-taught and learn by doing — that's your strength. But here's where self-taught people stall in programs like this:

- **Tutorial Hell**: Watching a Spring Boot video without pausing to code is not learning. Pause every 5–10 minutes and reproduce what you just saw.
- **Skipping the "why"**: You have Python instincts. Java and Spring will seem verbose. Don't just accept annotations — understand what they do internally.
- **Rushing Angular**: Angular is not just JavaScript. TypeScript + decorators + modules is a new mental model. Give it the full 2 weeks the plan allocates.
- **Skipping rest days**: Your brain consolidates during sleep. Non-negotiable.

---

## TOOLS TO INSTALL (Week 0 — Before You Start)

- IntelliJ IDEA Community Edition (free) — for Java/Spring
- VS Code + Angular Language Service extension — for Angular
- Node.js LTS version (for Angular CLI)
- Docker Desktop — for Week 6
- Postman or HTTPie — for testing REST APIs
- H2 Console (comes with Spring Boot — no separate install)
- Git (verify with `git --version`)

---

*Plan created: 13 June 2026 | Target completion: 25 July 2026*
*Handbook: DN 5.0 Deep Skilling — Java FSE Angular*