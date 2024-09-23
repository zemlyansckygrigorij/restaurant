package com.study.learn.sequence;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class Sequence  implements Seq{
    @GuardedBy("this") private int value;
    public synchronized int getNext(){
        System.out.println("value - "+value);
        return value++;
    }
    // Реентерабельность - Компьютерная программа в целом
    // или её отдельная процедура называется реентера́бельной (от англ. reentrant — повторно входимый),
    // если она разработана таким образом,
    // что одна и та же копия инструкций программы в памяти может быть совместно использована несколькими пользователями или процессами.

    //TimerTask A task that can be scheduled for one-time or repeated execution by a Timer.
    //. Устаревшие данные

    //безопасностью из неоткуда”
    // volatile гарантирует, что значение переменной будет сразу же записано в основную память,
    // а не в кэш процессора, и любые другие потоки будут видеть это обновленное значение.

    //ThreadLocal Класс ThreadLocal используется для хранения переменных.
    // Особенность этого класса в том, что он хранит отдельную независимую копию значения для каждого использующего ее потока.

    //AtomicReferences AtomicReference в Java используется для обеспечения атомарности операций в многопоточных программах.
    // Это означает, что операции выполняются как единый, неделимый


    //ConcurrentHashMap
    // Collections.unmodifiableMap
    //Collections.synchronizedList
    //CopyOnWriteArrayList
    //Queue и
    //BlockingQueue
    //ConcurrentLinkedQueue
    //ConcurrentSkipListMap и ConcurrentSkipListSet
    //BlockingQueue. Классы LinkedBlockingQueue и ArrayBlockingQueue
    //PriorityBlockingQueue


    // @ThreadSafe
    /**
     * The presence of this annotation indicates that the author believes the class to be thread-safe. As such, there should
     * be no sequence of accessing the public methods or fields that could put an instance of this class into an invalid
     * state, irrespective of any rearrangement of those operations by the Java Runtime and without introducing any
     * requirements for synchronization or coordination by the caller/accessor.
     */


//@Immutable
    /**
     * The presence of this annotation indicates that the author believes the class to be immutable and hence inherently
     * thread-safe. An immutable class is one where the state of an instance cannot be <i>seen</i> to change. As a result
     * <ul>
     * <li>All public fields must be {@code final}</li>
     * <li>All public final reference fields are either {@code null} or refer to other immutable objects</li>
     * <li>Constructors and methods do not publish references to any potentially mutable internal state.</li>
     * </ul>
     * Performance optimization may mean that instances of an immutable class may have mutable internal state. The
     * critical point is that callers cannot tell the difference. For example {@link String} is an immutable class, despite
     * having an internal int that is non-final but used as a cache for {@link String#hashCode()}.
     * <p/>
     * Immutable objects are inherently thread-safe; they may be passed between threads or published without
     * synchronization.
     */
//@NotThreadSafe
    /**
     * The presence of this annotation indicates that the author believes the class is not thread-safe.
     * The absence of this annotation does not indicate that the class is thread-safe, instead this annotation is for
     * cases where a naïve assumption could be easily made that the class is thread-safe. In general, it is a bad plan
     * to assume a class is thread safe without good reason.
     */

//    BigInteger

 //   @GuardedBy("this")
    /**
     * The specified lock that guards the annotated field or method. Valid values are:
     * <ul>
     * <li>{@code this} indicates the intrinsic lock of the instance containing the field or method.</li>
     * <li><code><i>class-name</i>.this</code> which allows for disambiguation of which {@code this} when dealing
     * with inner classes</li>
     * <li>{@code itself} which is valid for reference fields only, and indicates that the referenced instance's
     * own intrinsic lock should be used as the guard</li>
     * <li><code><i>field-name</i></code> indicates the named instance or static field is to be used as the guard. If
     * the field type is not a sub-type of {@link java.util.concurrent.locks.Lock} then the intrinsic lock of
     * the referenced instance is to be used</li>
     * <li><code><i>class-name</i>.<i>field-name</i></code> indicates the named static field is to be used as the
     * guard. If the field type is not a sub-type of {@link java.util.concurrent.locks.Lock} then the intrinsic lock of
     * the referenced instance is to be used</li>
     * <li><code><i>method-name</i>()</code> indicates that the zero-argument method should be called to obtain the
     * lock object. If the return type is not a sub-type of {@link java.util.concurrent.locks.Lock} then the intrinsic
     * lock of the returned instance is to be used</li>
     * <li><code><i>class-name</i>.class</code> indicates that the intrinsic lock of the specified class should be used
     * as the guard</li>
     * </ul>
     *
     * @return The specified lock that guards the annotated field or method
     */
  //  synchronized
  //  import net.jcip.annotations.NotThreadSafe;
}
