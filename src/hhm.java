// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public abstract class hhm
{

    private hhp a;
    public final hhq b;
    public final hho c;
    public volatile Object d;
    public volatile int e;
    public volatile boolean f;
    public volatile int g;
    public volatile int h;
    public boolean i;
    public boolean j;
    private Object k;
    private ArrayList l;

    public hhm(hhq hhq1, hho hho)
    {
        b = hhq1;
        c = hho;
        i = Log.isLoggable("EsResource", 3);
    }

    private void a()
    {
        if (j)
        {
            throw new ConcurrentModificationException("Registering/unregistering resource while delivering status change notification");
        } else
        {
            return;
        }
    }

    private static void a(StringBuilder stringbuilder, hhp hhp1, Object obj)
    {
        stringbuilder.append(hhp1);
        if (hhp1 instanceof View)
        {
            stringbuilder.append(" context: ").append(((View)hhp1).getContext());
        }
        if (obj != null)
        {
            stringbuilder.append(" tag: ").append(obj);
        }
    }

    private static String b(int i1)
    {
        switch (i1)
        {
        default:
            return String.valueOf(i1);

        case 7: // '\007'
            return "canceled";

        case 2: // '\002'
            return "loading";

        case 3: // '\003'
            return "not found";

        case 6: // '\006'
            return "out of memory";

        case 8: // '\b'
            return "packed";

        case 5: // '\005'
            return "permanent error";

        case 1: // '\001'
            return "ready";

        case 4: // '\004'
            return "transient error";

        case 0: // '\0'
            return "undefined";
        }
    }

    public boolean A()
    {
        return i;
    }

    public int B()
    {
        if (l != null)
        {
            return l.size();
        }
        return a == null ? 0 : 1;
    }

    public void C()
    {
        g.v();
        if (B() == 0)
        {
            n();
            return;
        }
        j = true;
        if (l == null) goto _L2; else goto _L1
_L1:
        int j1 = l.size();
        int i1 = 0;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((hhn)l.get(i1)).a.a(this);
        i1++;
        if (true) goto _L4; else goto _L3
_L2:
        if (a != null)
        {
            a.a(this);
        }
_L3:
        j = false;
        return;
        Exception exception;
        exception;
        j = false;
        throw exception;
    }

    public void a(int i1)
    {
        if (e != 2)
        {
            if (A())
            {
                String s = String.valueOf(c);
                String s2 = String.valueOf(y());
                String s4 = String.valueOf(b(i1));
                (new StringBuilder(String.valueOf(s).length() + 96 + String.valueOf(s2).length() + String.valueOf(s4).length())).append("Request no longer needed, not delivering status change: ").append(s).append(", current status: ").append(s2).append(", ignored new status: ").append(s4);
            }
            return;
        }
        if (A())
        {
            String s1 = String.valueOf(c);
            String s3 = String.valueOf(b(i1));
            (new StringBuilder(String.valueOf(s1).length() + 45 + String.valueOf(s3).length())).append("Delivering error code to consumers: ").append(s1).append(" status: ").append(s3);
        }
        b.a(this, i1);
    }

    public void a(int i1, String s)
    {
        if (i1 == 404)
        {
            b.a(this, 3);
            return;
        }
        if (i1 == 401)
        {
            b.a(this, 4, i1);
            return;
        } else
        {
            b.a(this, 5, i1);
            return;
        }
    }

    public void a(hhp hhp1)
    {
        g.v();
        a();
        if (a != hhp1 || k != null && (k == null || !k.equals(null))) goto _L2; else goto _L1
_L1:
        int i1 = 1;
_L4:
        if (i1 != 0)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (l != null)
        {
            int j1 = l.size();
            i1 = 0;
            do
            {
                if (i1 >= j1)
                {
                    break;
                }
                if (((hhn)l.get(i1)).a(hhp1, null))
                {
                    i1 = 1;
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
            } while (true);
        }
        i1 = 0;
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (l != null)
        {
            flag = l.isEmpty();
            l.add(new hhn(hhp1, null));
        } else
        if (a != null)
        {
            l = new ArrayList();
            l.add(new hhn(a, k));
            a = null;
            k = null;
            l.add(new hhn(hhp1, null));
            flag = false;
        } else
        {
            a = hhp1;
            k = null;
            flag = true;
        }
        if (flag)
        {
            b.a(this);
        }
        hhp1.a(this);
        return;
    }

    public abstract void a(Object obj);

    public void a(String s, Throwable throwable)
    {
        Log.e("EsResource", s, throwable);
    }

    public void a(StringBuilder stringbuilder)
    {
    }

    public void b(hhp hhp1)
    {
        a(hhp1);
    }

    public abstract void c();

    public void c(int i1)
    {
        e = i1;
    }

    public void c(hhp hhp1)
    {
        g.v();
        a();
        if (a != hhp1 || k != null && (k == null || !k.equals(null))) goto _L2; else goto _L1
_L1:
        a = null;
        k = null;
        b.b(this);
_L4:
        return;
_L2:
        if (l == null) goto _L4; else goto _L3
_L3:
        int i1;
        int j1;
        j1 = l.size();
        i1 = 0;
_L6:
        if (i1 >= j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((hhn)l.get(i1)).a(hhp1, null))
        {
            break MISSING_BLOCK_LABEL_132;
        }
        l.remove(i1);
        if (!l.isEmpty()) goto _L4; else goto _L5
_L5:
        b.b(this);
        return;
        i1++;
          goto _L6
    }

    public void c(Object obj)
    {
        b.a(this, 1, obj);
    }

    public void d(hhp hhp1)
    {
        c(hhp1);
    }

    public File h()
    {
        return null;
    }

    public File i()
    {
        return null;
    }

    public void n()
    {
        e = 0;
        d = null;
    }

    public boolean q()
    {
        return true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append('@').append(System.identityHashCode(this)).append("\n  ID: ").append(c).append("\n  Status: ").append(y());
        if (f)
        {
            stringbuilder.append("; downloading");
        }
        if (d != null)
        {
            a(stringbuilder);
        }
        stringbuilder.append("\n  Consumers:");
        if (l != null)
        {
            int j1 = l.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                hhn hhn1 = (hhn)l.get(i1);
                stringbuilder.append("\n   ");
                a(stringbuilder, hhn1.a, hhn1.b);
            }

        } else
        if (a != null)
        {
            stringbuilder.append("\n   ");
            a(stringbuilder, a, k);
        } else
        {
            stringbuilder.append("\n   none");
        }
        return stringbuilder.toString();
    }

    public hho w()
    {
        return c;
    }

    public int x()
    {
        return e;
    }

    public String y()
    {
        return b(e);
    }

    public Object z()
    {
        return d;
    }
}
