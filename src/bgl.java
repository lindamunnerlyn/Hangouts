// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.os.Debug;
import java.util.Iterator;

public final class bgl extends AsyncTask
{

    private fqp a;
    private gz b;
    private gz c;
    private final bgm d;
    private final dmn e;

    public bgl(fqp fqp1, dmn dmn, bgm bgm1)
    {
        b = new gz();
        c = new gz();
        e = dmn;
        d = bgm1;
        a = fqp1;
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
        ebw.e("Babel", (new StringBuilder(29)).append("Loading contacts: ").append(i).toString());
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
            ebw.f("Babel", "ContactLookupProviderAsyncTask interrupted.");
            a();
            break; /* Loop/switch isn't completed */
        }
        catch (IllegalStateException illegalstateexception)
        {
            ebw.f("Babel", "ContactLookupProviderAsyncTask interrupted.");
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
            ebw.g("Babel", "Low memory! Halting contact load.");
            break; /* Loop/switch isn't completed */
        }
        obj = (fqo)a.a(j);
        if (!bhj.b(((fqo) (obj))))
        {
            break MISSING_BLOCK_LABEL_330;
        }
        iterator = ((fqo) (obj)).d().iterator();
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_251;
        }
        obj2 = (fqz)iterator.next();
        if (isCancelled())
        {
            throw new InterruptedException();
        }
        obj2 = ebz.k(((fqz) (obj2)).b());
        if (!b.containsKey(obj2))
        {
            b.put(obj2, Integer.valueOf(j));
        }
          goto _L3
        obj = ((fqo) (obj)).b().iterator();
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

    public fqo a(String s)
    {
        if (a != null && !a.c() && c.containsKey(s))
        {
            return (fqo)a.a(g.a((Integer)c.get(s), 0));
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

    public fqo b(String s)
    {
        s = ebz.k(s);
        if (a != null && !a.c() && b.containsKey(s))
        {
            return (fqo)a.a(g.a((Integer)b.get(s), 0));
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
