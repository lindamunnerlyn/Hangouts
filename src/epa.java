// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class epa extends em
    implements enb, end
{

    public final emy a;
    private boolean b;
    private ConnectionResult c;

    public epa(Context context, emy emy1)
    {
        super(context);
        a = emy1;
    }

    private void b(ConnectionResult connectionresult)
    {
        c = connectionresult;
        if (p() && !q())
        {
            b(connectionresult);
        }
    }

    public void a(int l)
    {
    }

    public void a(ConnectionResult connectionresult)
    {
        b = true;
        b(connectionresult);
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        a.a(s, printwriter);
    }

    public void a_(Bundle bundle)
    {
        b = false;
        b(ConnectionResult.a);
    }

    public boolean c()
    {
        return b;
    }

    protected void i()
    {
        super.i();
        a.a(this);
        a.a(this);
        if (c != null)
        {
            b(c);
        }
        if (!a.e() && !a.f() && !b)
        {
            a.b();
        }
    }

    protected void j()
    {
        a.d();
    }

    protected void k()
    {
        c = null;
        b = false;
        a.b(this);
        a.b(this);
        a.d();
    }
}
