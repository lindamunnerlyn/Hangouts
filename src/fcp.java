// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

public class fcp
{

    public final ViewGroup a;
    public final fjm b;
    public View c;

    public fcp(ViewGroup viewgroup, fjm fjm1)
    {
        b = (fjm)g.d(fjm1);
        a = (ViewGroup)g.d(viewgroup);
    }

    public void a()
    {
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new af(remoteexception);
        }
    }

    public void a(Bundle bundle)
    {
        try
        {
            b.a(bundle);
            c = (View)fcz.a(b.f());
            a.removeAllViews();
            a.addView(c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new af(bundle);
        }
    }

    public void a(fiy fiy)
    {
        try
        {
            b.a(new fiv(this, fiy));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (fiy fiy)
        {
            throw new af(fiy);
        }
    }

    public void b()
    {
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new af(remoteexception);
        }
    }

    public void c()
    {
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new af(remoteexception);
        }
    }
}
