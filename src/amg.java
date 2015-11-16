// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class amg
    implements Runnable
{

    private static final efh a = efh.a("concurrent");
    private final amm b;
    private final Context c;

    public amg(Context context, amm amm1)
    {
        c = context;
        b = amm1;
    }

    public void run()
    {
_L8:
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = b.a();
        if (obj1 == null)
        {
            return;
        }
        obj2 = b.a(((alz) (obj1)).a);
        obj = String.valueOf(((alz) (obj1)).a());
        efh efh1;
        String s;
        int i;
        if (((String) (obj)).length() != 0)
        {
            "Running task ".concat(((String) (obj)));
        } else
        {
            new String("Running task ");
        }
        efh1 = a;
        obj = String.valueOf("RUN_");
        s = String.valueOf(((alz) (obj1)).a());
        if (s.length() != 0)
        {
            obj = ((String) (obj)).concat(s);
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj = efh1.b(((String) (obj)));
        i = ((alz) (obj1)).a(((Class) (obj2))).a(((alz) (obj1)).c);
        obj2 = b;
        obj2;
        JVM INSTR monitorenter ;
        obj1.f = i;
        amh.a[((alz) (obj1)).f - 1];
        JVM INSTR tableswitch 1 4: default 287
    //                   1 200
    //                   2 255
    //                   3 265
    //                   4 276;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException("Invalid task state");
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        b.b(((alz) (obj1)));
        obj1 = String.valueOf(((alz) (obj1)).a());
        if (((String) (obj1)).length() == 0) goto _L7; else goto _L6
_L6:
        "Task finished. ".concat(((String) (obj1)));
_L9:
        obj2;
        JVM INSTR monitorexit ;
        a.c(((String) (obj)));
          goto _L8
_L7:
        new String("Task finished. ");
          goto _L9
_L3:
        obj1.f = aly.a;
          goto _L9
_L4:
        b.b(((alz) (obj1)));
          goto _L9
_L5:
        b.c(((alz) (obj1)));
          goto _L9
    }

}
