// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

public class ezr
{

    public final ViewGroup a;
    public final fgq b;
    public View c;

    public ezr(ViewGroup viewgroup, fgq fgq1)
    {
        b = (fgq)h.a(fgq1);
        a = (ViewGroup)h.a(viewgroup);
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
            c = (View)fab.a(b.f());
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

    public void a(fgc fgc)
    {
        try
        {
            b.a(new ffz(this, fgc));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (fgc fgc)
        {
            throw new af(fgc);
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
