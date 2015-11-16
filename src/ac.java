// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class ac extends ad
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener
{

    int a;
    int b;
    boolean c;
    boolean d;
    int e;
    Dialog f;
    boolean g;
    boolean h;
    boolean i;

    public ac()
    {
        a = 0;
        b = 0;
        c = true;
        d = true;
        e = -1;
    }

    public int a(bg bg1, String s)
    {
        h = false;
        i = true;
        bg1.a(this, s);
        g = false;
        e = bg1.b();
        return e;
    }

    public Dialog a(Bundle bundle)
    {
        return new Dialog(getActivity(), d());
    }

    public void a()
    {
        a(false);
    }

    public void a(int j)
    {
        a = 1;
        if (a == 2 || a == 3)
        {
            b = 0x1030059;
        }
        if (j != 0)
        {
            b = j;
        }
    }

    public void a(Dialog dialog, int j)
    {
        switch (j)
        {
        default:
            return;

        case 3: // '\003'
            dialog.getWindow().addFlags(24);
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            dialog.requestWindowFeature(1);
            break;
        }
    }

    public void a(ap ap1, String s)
    {
        h = false;
        i = true;
        ap1 = ap1.a();
        ap1.a(this, s);
        ap1.b();
    }

    void a(boolean flag)
    {
        if (h)
        {
            return;
        }
        h = true;
        i = false;
        if (f != null)
        {
            f.dismiss();
            f = null;
        }
        g = true;
        if (e >= 0)
        {
            getFragmentManager().b(e);
            e = -1;
            return;
        }
        bg bg1 = getFragmentManager().a();
        bg1.a(this);
        if (flag)
        {
            bg1.c();
            return;
        } else
        {
            bg1.b();
            return;
        }
    }

    public void b()
    {
        a(true);
    }

    public void b(boolean flag)
    {
        c = flag;
        if (f != null)
        {
            f.setCancelable(flag);
        }
    }

    public Dialog c()
    {
        return f;
    }

    public int d()
    {
        return b;
    }

    public boolean e()
    {
        return c;
    }

    public void f()
    {
        d = false;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        if (!d)
        {
            return super.getLayoutInflater(bundle);
        }
        f = a(bundle);
        if (f != null)
        {
            a(f, a);
            return (LayoutInflater)f.getContext().getSystemService("layout_inflater");
        } else
        {
            return (LayoutInflater)D.i().getSystemService("layout_inflater");
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (d)
        {
            View view = getView();
            if (view != null)
            {
                if (view.getParent() != null)
                {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                f.setContentView(view);
            }
            f.setOwnerActivity(getActivity());
            f.setCancelable(c);
            f.setOnCancelListener(this);
            f.setOnDismissListener(this);
            if (bundle != null)
            {
                bundle = bundle.getBundle("android:savedDialogState");
                if (bundle != null)
                {
                    f.onRestoreInstanceState(bundle);
                    return;
                }
            }
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (!i)
        {
            h = false;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        boolean flag;
        if (H == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (bundle != null)
        {
            a = bundle.getInt("android:style", 0);
            b = bundle.getInt("android:theme", 0);
            c = bundle.getBoolean("android:cancelable", true);
            d = bundle.getBoolean("android:showsDialog", d);
            e = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (f != null)
        {
            g = true;
            f.dismiss();
            f = null;
        }
    }

    public void onDetach()
    {
        super.onDetach();
        if (!i && !h)
        {
            h = true;
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!g)
        {
            a(true);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (f != null)
        {
            Bundle bundle1 = f.onSaveInstanceState();
            if (bundle1 != null)
            {
                bundle.putBundle("android:savedDialogState", bundle1);
            }
        }
        if (a != 0)
        {
            bundle.putInt("android:style", a);
        }
        if (b != 0)
        {
            bundle.putInt("android:theme", b);
        }
        if (!c)
        {
            bundle.putBoolean("android:cancelable", c);
        }
        if (!d)
        {
            bundle.putBoolean("android:showsDialog", d);
        }
        if (e != -1)
        {
            bundle.putInt("android:backStackId", e);
        }
    }

    public void onStart()
    {
        super.onStart();
        if (f != null)
        {
            g = false;
            f.show();
        }
    }

    public void onStop()
    {
        super.onStop();
        if (f != null)
        {
            f.hide();
        }
    }
}
