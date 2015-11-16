// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.os.Debug;
import java.util.Iterator;

public final class bgx extends AsyncTask
{

    private fti a;
    private gz b;
    private gz c;
    private final bgy d;
    private final dph e;

    public bgx(fti fti1, dph dph, bgy bgy1)
    {
        b = new gz();
        c = new gz();
        e = dph;
        d = bgy1;
        a = fti1;
    }

    private transient Void b()
    {
        android.os.Debug.MemoryInfo memoryinfo;
        b.clear();
        c.clear();
        memoryinfo = new android.os.Debug.MemoryInfo();
        if (a == null) goto _L2; else goto _L1
_L1:
        int i = a.a();
        eev.e("Babel", (new StringBuilder(29)).append("Loading contacts: ").append(i).toString());
        int j = 0;
_L4:
        Object obj;
        Iterator iterator;
        Object obj2;
        try
        {
            if (j >= a.a())
            {
                break; /* Loop/switch isn't completed */
            }
        }
        catch (InterruptedException interruptedexception)
        {
            eev.f("Babel", "ContactLookupProviderAsyncTask interrupted.");
            a();
            break; /* Loop/switch isn't completed */
        }
        catch (IllegalStateException illegalstateexception)
        {
            eev.f("Babel", "ContactLookupProviderAsyncTask interrupted.");
            a();
            break; /* Loop/switch isn't completed */
        }
        if (j % 100 != 0)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        Debug.getMemoryInfo(memoryinfo);
        if (memoryinfo.getTotalPss() < 2048)
        {
            eev.g("Babel", "Low memory! Halting contact load.");
            break; /* Loop/switch isn't completed */
        }
        obj = (fth)a.a(j);
        if (!bhv.b(((fth) (obj))))
        {
            break MISSING_BLOCK_LABEL_330;
        }
        iterator = ((fth) (obj)).d().iterator();
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_251;
        }
        obj2 = (ftq)iterator.next();
        if (isCancelled())
        {
            throw new InterruptedException();
        }
        obj2 = eey.k(((ftq) (obj2)).b());
        if (!b.containsKey(obj2))
        {
            b.put(obj2, Integer.valueOf(j));
        }
          goto _L3
        obj = ((fth) (obj)).b().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (Long)((Iterator) (obj)).next();
            if (isCancelled())
            {
                throw new InterruptedException();
            }
            obj1 = String.valueOf(obj1);
            if (!c.containsKey(obj1))
            {
                c.put(obj1, Integer.valueOf(j));
            }
        } while (true);
        j++;
        if (true) goto _L4; else goto _L2
_L2:
        return null;
    }

    public fth a(String s)
    {
        if (a != null && !a.c() && c.containsKey(s))
        {
            return (fth)a.a(g.a((Integer)c.get(s), 0));
        } else
        {
            return null;
        }
    }

    public void a()
    {
        a = null;
        b.clear();
        c.clear();
    }

    public fth b(String s)
    {
        s = eey.k(s);
        if (a != null && !a.c() && b.containsKey(s))
        {
            return (fth)a.a(g.a((Integer)b.get(s), 0));
        } else
        {
            return null;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return b();
    }

    protected void onPostExecute(Object obj)
    {
        if (!isCancelled())
        {
            d.a(e, this);
        }
    }
}
