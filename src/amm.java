// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class amm
{

    private Map a;
    private Map b;
    private boolean c;

    public amm()
    {
        a = new HashMap();
        b = null;
    }

    alz a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (a.size() > 5)
        {
            int i = a.size();
            (new StringBuilder(57)).append("*** Obtaining new task; current task backlog: ").append(i);
        }
        flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((alz) (obj1));
_L2:
        Object obj;
        long l = SystemClock.elapsedRealtime();
        obj1 = a.keySet().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_166;
            }
            obj = (String)((Iterator) (obj1)).next();
            obj = (alz)((List)a.get(obj)).get(0);
        } while (((alz) (obj)).f != aly.a || l < ((alz) (obj)).d);
_L5:
        obj1 = obj;
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj.f = aly.b;
        obj1 = obj;
          goto _L4
        obj;
        throw obj;
        obj = null;
          goto _L5
    }

    Class a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = ((amn)b.get(s)).a;
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void a(alz alz1)
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        String s;
        if (a.size() > 5)
        {
            int i = a.size();
            (new StringBuilder(55)).append("*** Adding new tasks; current task backlog: ").append(i);
        }
        s = alz1.c.b();
        list = (List)a.get(s);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        obj = new LinkedList();
        a.put(s, obj);
        ((List) (obj)).add(alz1);
        this;
        JVM INSTR monitorexit ;
        return;
        alz1;
        throw alz1;
    }

    public void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b != null) goto _L1; else goto _L3
_L3:
        b = new HashMap();
        context = hlp.c(context, amb).iterator();
_L11:
        if (!context.hasNext()) goto _L5; else goto _L4
_L4:
        Object obj;
        Field afield[];
        int j;
        obj = (amb)context.next();
        afield = ((amb) (obj)).a.getFields();
        j = afield.length;
        int i = 0;
_L10:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        if (!afield[i].getName().equals("CREATOR")) goto _L7; else goto _L6
_L6:
        i = 1;
_L12:
        if (i != 0) goto _L9; else goto _L8
_L8:
        throw new IllegalArgumentException("Invalid task added - add a Parcelable CREATOR.");
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
_L7:
        i++;
          goto _L10
_L9:
label0:
        {
            amn amn1 = new amn();
            amn1.a = ((amb) (obj)).a;
            amn1.b = ((amb) (obj)).a.isAssignableFrom(alv);
            b.put(((amb) (obj)).b, amn1);
            obj = String.valueOf(((amb) (obj)).b);
            if (((String) (obj)).length() == 0)
            {
                break label0;
            }
            "*** Loaded ".concat(((String) (obj)));
        }
          goto _L11
        new String("*** Loaded ");
          goto _L11
_L5:
        i = b.size();
        (new StringBuilder(27)).append("Loaded ").append(i).append(" classes.");
          goto _L1
        i = 0;
          goto _L12
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        int i = a.size();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        (new StringBuilder(75)).append("Stopping ConcurrentService while there are ").append(i).append(" tasks still pending.");
        c = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void b(alz alz1)
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        alz1 = alz1.c.b();
        list = (List)a.get(alz1);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        list.remove(0);
        if (list.isEmpty())
        {
            a.remove(alz1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        alz1;
        throw alz1;
    }

    void c(alz alz1)
    {
        this;
        JVM INSTR monitorenter ;
        alz1 = alz1.c.b();
        a.remove(alz1);
        this;
        JVM INSTR monitorexit ;
        return;
        alz1;
        throw alz1;
    }
}
