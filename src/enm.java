// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public abstract class enm extends enj
    implements enn, eoo
{

    private AtomicReference a;
    final emx h;

    public enm(emx emx1, emy emy1)
    {
        super(((emy)g.b(emy1, "GoogleApiClient must not be null")).a());
        a = new AtomicReference();
        h = (emx)g.d(emx1);
    }

    private void a(RemoteException remoteexception)
    {
        c(new Status(8, remoteexception.getLocalizedMessage(), null));
    }

    public abstract void a(emw emw);

    public void a(eon eon1)
    {
        a.set(eon1);
    }

    public void a(Object obj)
    {
        super.a((enh)obj);
    }

    public final void b(emw emw)
    {
        try
        {
            a(emw);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (emw emw)
        {
            a(emw);
            throw emw;
        }
        // Misplaced declaration of an exception variable
        catch (emw emw)
        {
            a(emw);
        }
    }

    public final void c(Status status)
    {
        boolean flag;
        if (!status.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag, "Failed result must not be success");
        a(a(status));
    }

    protected void e()
    {
        eon eon1 = (eon)a.getAndSet(null);
        if (eon1 != null)
        {
            eon1.a(this);
        }
    }

    public final emx f()
    {
        return h;
    }
}
