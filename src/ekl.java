// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ekl extends eki
    implements ekm, eln
{

    private AtomicReference a;
    final ejw h;

    public ekl(ejw ejw1, ejx ejx1)
    {
        super(((ejx)h.a(ejx1, "GoogleApiClient must not be null")).a());
        a = new AtomicReference();
        h = (ejw)h.a(ejw1);
    }

    private void a(RemoteException remoteexception)
    {
        c(new Status(8, remoteexception.getLocalizedMessage(), null));
    }

    public abstract void a(ejv ejv);

    public void a(elm elm1)
    {
        a.set(elm1);
    }

    public void a(Object obj)
    {
        super.a((ekg)obj);
    }

    public final void b(ejv ejv)
    {
        try
        {
            a(ejv);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ejv ejv)
        {
            a(ejv);
            throw ejv;
        }
        // Misplaced declaration of an exception variable
        catch (ejv ejv)
        {
            a(ejv);
        }
    }

    public final void c(Status status)
    {
        boolean flag;
        if (!status.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.b(flag, "Failed result must not be success");
        a(a(status));
    }

    protected void d()
    {
        elm elm1 = (elm)a.getAndSet(null);
        if (elm1 != null)
        {
            elm1.a(this);
        }
    }

    public final ejw e()
    {
        return h;
    }
}
