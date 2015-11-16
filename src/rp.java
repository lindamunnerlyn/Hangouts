// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;

public class rp extends Dialog
    implements qs
{

    private qt a;

    public rp(Context context, int i)
    {
        int j = i;
        if (i == 0)
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(g.D, typedvalue, true);
            j = typedvalue.resourceId;
        }
        super(context, j);
        b().a(null);
    }

    public void a(vt vt)
    {
    }

    public boolean a()
    {
        return b().b(1);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        b().b(view, layoutparams);
    }

    public qt b()
    {
        if (a == null)
        {
            a = qt.a(getContext(), getWindow(), this);
        }
        return a;
    }

    public void b(vt vt)
    {
    }

    public void invalidateOptionsMenu()
    {
        b().f();
    }

    protected void onCreate(Bundle bundle)
    {
        b().i();
        super.onCreate(bundle);
        b().a(bundle);
    }

    protected void onStop()
    {
        super.onStop();
        b().d();
    }

    public void setContentView(int i)
    {
        b().a(i);
    }

    public void setContentView(View view)
    {
        b().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        b().a(view, layoutparams);
    }

    public void setTitle(int i)
    {
        super.setTitle(i);
        b().a(getContext().getString(i));
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        b().a(charsequence);
    }
}
