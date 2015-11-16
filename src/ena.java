// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.ValidateAccountRequest;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ena
    implements ejv, enl
{

    public static final String d[] = {
        "service_esmobile", "service_googleme"
    };
    public final Context a;
    final Handler b;
    public AtomicInteger c;
    private final emo e;
    private final Looper f;
    private final enm g;
    private final ejk h;
    private final Object i;
    private eny j;
    private ekb k;
    private IInterface l;
    private final ArrayList m;
    private enf n;
    private int o;
    private final Set p;
    private final Account q;
    private final eka r;
    private final ekc s;
    private final int t;

    public ena(Context context, Looper looper, int i1, emo emo1, eka eka1, ekc ekc1)
    {
        this(context, looper, enm.a(context), ejk.a(), i1, emo1, (eka)h.a(eka1), (ekc)h.a(ekc1));
    }

    private ena(Context context, Looper looper, enm enm1, ejk ejk1, int i1, emo emo1, eka eka1, 
            ekc ekc1)
    {
        i = new Object();
        m = new ArrayList();
        o = 1;
        c = new AtomicInteger(0);
        a = (Context)h.a(context, "Context must not be null");
        f = (Looper)h.a(looper, "Looper must not be null");
        g = (enm)h.a(enm1, "Supervisor must not be null");
        h = (ejk)h.a(ejk1, "API availability must not be null");
        b = new enc(this, looper);
        t = i1;
        e = (emo)h.a(emo1);
        q = emo1.a();
        p = b(emo1.d());
        r = eka1;
        s = ekc1;
    }

    static ekb a(ena ena1)
    {
        return ena1.k;
    }

    static eny a(ena ena1, eny eny1)
    {
        ena1.j = eny1;
        return eny1;
    }

    private void a(int i1, IInterface iinterface)
    {
        boolean flag2 = true;
        Object obj;
        boolean flag;
        boolean flag1;
        if (i1 == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (iinterface != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            flag2 = false;
        }
        h.b(flag2);
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        o = i1;
        l = iinterface;
        i1;
        JVM INSTR tableswitch 1 3: default 280
    //                   1 243
    //                   2 79
    //                   3 76;
           goto _L1 _L2 _L3 _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (n != null)
        {
            Log.e("GmsClient", (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(a()).toString());
            g.b(a(), n, e.g());
            c.incrementAndGet();
        }
        n = new enf(this, c.get());
        if (!g.a(a(), n, e.g()))
        {
            Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(a()).toString());
            b.sendMessage(b.obtainMessage(3, c.get(), 9));
        }
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L2:
        if (n == null) goto _L1; else goto _L4
_L4:
        g.b(a(), n, e.g());
        n = null;
          goto _L1
    }

    static void a(ena ena1, int i1)
    {
        ena1.a(i1, ((IInterface) (null)));
    }

    private boolean a(int i1, int j1, IInterface iinterface)
    {
label0:
        {
            synchronized (i)
            {
                if (o == i1)
                {
                    break label0;
                }
            }
            return false;
        }
        a(j1, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static boolean a(ena ena1, int i1, int j1, IInterface iinterface)
    {
        return ena1.a(i1, j1, iinterface);
    }

    static eka b(ena ena1)
    {
        return ena1.r;
    }

    private Set b(Set set)
    {
        Set set1 = a(set);
        if (set1 == null)
        {
            return set1;
        }
        for (Iterator iterator = set1.iterator(); iterator.hasNext();)
        {
            if (!set.contains((Scope)iterator.next()))
            {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }

        return set1;
    }

    static ArrayList c(ena ena1)
    {
        return ena1.m;
    }

    static Set d(ena ena1)
    {
        return ena1.p;
    }

    static ekc e(ena ena1)
    {
        return ena1.s;
    }

    public abstract IInterface a(IBinder ibinder);

    public abstract String a();

    protected Set a(Set set)
    {
        return set;
    }

    protected void a(int i1)
    {
        b.sendMessage(b.obtainMessage(6, i1, -1, new eni(this)));
    }

    protected void a(int i1, Bundle bundle, int j1)
    {
        b.sendMessage(b.obtainMessage(5, j1, -1, new enj(this, i1, bundle)));
    }

    public void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        b.sendMessage(b.obtainMessage(1, j1, -1, new enh(this, i1, ibinder, bundle)));
    }

    public void a(ekb ekb1)
    {
        k = (ekb)h.a(ekb1, "Connection progress callbacks cannot be null.");
        a(2, ((IInterface) (null)));
    }

    public void a(emq emq)
    {
        emq = new ValidateAccountRequest(emq, (Scope[])p.toArray(new Scope[p.size()]), a.getPackageName(), null);
        try
        {
            j.a(new ene(this, c.get()), emq);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (emq emq)
        {
            j();
        }
        // Misplaced declaration of an exception variable
        catch (emq emq)
        {
            return;
        }
    }

    public void a(emq emq, Set set)
    {
        Object obj;
        try
        {
            obj = k();
            obj = (new GetServiceRequest(t)).a(a.getPackageName()).a(((Bundle) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (emq emq)
        {
            j();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (emq emq)
        {
            return;
        }
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        ((GetServiceRequest) (obj)).a(set);
        if (!e()) goto _L2; else goto _L1
_L1:
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        set = q;
_L4:
        ((GetServiceRequest) (obj)).a(set).a(emq);
_L2:
        j.a(new ene(this, c.get()), ((GetServiceRequest) (obj)));
        return;
        set = new Account("<<default account>>", "com.google");
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(String s1, PrintWriter printwriter)
    {
        IInterface iinterface;
        int i1;
        synchronized (i)
        {
            i1 = o;
            iinterface = l;
        }
        printwriter.append(s1).append("mConnectState=");
        i1;
        JVM INSTR tableswitch 1 4: default 64
    //                   1 127
    //                   2 97
    //                   3 107
    //                   4 117;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_127;
_L1:
        printwriter.print("UNKNOWN");
_L6:
        printwriter.append(" mService=");
        if (iinterface == null)
        {
            printwriter.println("null");
            return;
        } else
        {
            printwriter.append(b()).append("@").println(Integer.toHexString(System.identityHashCode(iinterface.asBinder())));
            return;
        }
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
_L3:
        printwriter.print("CONNECTING");
          goto _L6
_L4:
        printwriter.print("CONNECTED");
          goto _L6
_L5:
        printwriter.print("DISCONNECTING");
          goto _L6
        printwriter.print("DISCONNECTED");
          goto _L6
    }

    public abstract String b();

    public void c()
    {
        c.incrementAndGet();
        ArrayList arraylist = m;
        arraylist;
        JVM INSTR monitorenter ;
        int j1 = m.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((end)m.get(i1)).d();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        m.clear();
        arraylist;
        JVM INSTR monitorexit ;
        a(1, ((IInterface) (null)));
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean d()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (o == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean e()
    {
        return false;
    }

    protected void f()
    {
    }

    protected void g()
    {
    }

    public void h()
    {
        int i1 = ejk.a(a);
        if (i1 != 0)
        {
            a(1, ((IInterface) (null)));
            k = new eng(this);
            b.sendMessage(b.obtainMessage(3, c.get(), i1));
            return;
        } else
        {
            a(new eng(this));
            return;
        }
    }

    public boolean i()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (o == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void j()
    {
        b.sendMessage(b.obtainMessage(4, c.get(), 1));
    }

    public Bundle k()
    {
        return new Bundle();
    }

    public final void l()
    {
        if (!d())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public Bundle m()
    {
        return null;
    }

    public final IInterface n()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (o == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        l();
        IInterface iinterface;
        boolean flag;
        if (l != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag, "Client is connected but service is null");
        iinterface = l;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

}
