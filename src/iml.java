// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class iml
    implements Runnable
{

    final Set a;
    final imk b;

    iml(imk imk1, Set set)
    {
        b = imk1;
        a = set;
        super();
    }

    public void run()
    {
        Object obj;
        Map map;
        HashSet hashset;
        map = Thread.getAllStackTraces();
        hashset = new HashSet();
        obj = map.keySet().iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Thread thread = (Thread)((Iterator) (obj)).next();
        if (!a.contains(thread) && thread != Thread.currentThread() && !imk.b().matcher(thread.getName()).matches() && !imk.a((StackTraceElement[])map.get(thread)))
        {
            hashset.add(thread);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Throwable throwable;
        throwable;
        throwable.printStackTrace();
_L6:
        return;
_L2:
        if (!imk.a(hashset)) goto _L6; else goto _L5
_L5:
        Iterator iterator = hashset.iterator();
_L9:
        Thread thread1;
        Object obj1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_276;
        }
        thread1 = (Thread)iterator.next();
        obj1 = System.out;
        throwable = String.valueOf(thread1.getName());
        if (throwable.length() == 0) goto _L8; else goto _L7
_L7:
        throwable = "Thread is ".concat(throwable);
_L10:
        ((PrintStream) (obj1)).println(throwable);
        throwable = System.out;
        obj1 = String.valueOf(thread1.getState());
        throwable.println((new StringBuilder(String.valueOf(obj1).length() + 9)).append("State is ").append(((String) (obj1))).toString());
        throwable = (StackTraceElement[])map.get(thread1);
        System.out.println(Arrays.toString(throwable));
          goto _L9
_L8:
        throwable = new String("Thread is ");
          goto _L10
        g.a(new imm(this, hashset));
        return;
          goto _L9
    }
}
