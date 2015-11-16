// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class hjh extends hjr
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, hki
{

    private android.app.AlertDialog.Builder a;
    private CharSequence c;
    private CharSequence d;
    private Drawable e;
    private CharSequence f;
    private CharSequence g;
    private int h;
    private Dialog i;
    private int j;

    public hjh(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.tJ);
    }

    private hjh(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        context = context.obtainStyledAttributes(attributeset, hkr.T, k, 0);
        c = context.getString(hkr.X);
        if (c == null)
        {
            c = o();
        }
        d = context.getString(hkr.W);
        e = context.getDrawable(hkr.U);
        f = context.getString(hkr.Z);
        g = context.getString(hkr.Y);
        h = context.getResourceId(hkr.V, h);
        context.recycle();
    }

    public CharSequence a()
    {
        return d;
    }

    public void a(int k)
    {
        a(((CharSequence) (x().getString(k))));
    }

    public void a(android.app.AlertDialog.Builder builder)
    {
    }

    protected void a(Bundle bundle)
    {
        Object obj = x();
        j = -2;
        a = (new android.app.AlertDialog.Builder(((Context) (obj)))).setTitle(c).setIcon(e).setPositiveButton(f, this).setNegativeButton(g, this);
        obj = c();
        if (obj != null)
        {
            b(((View) (obj)));
            a.setView(((View) (obj)));
        } else
        {
            a.setMessage(d);
        }
        a(a);
        B().a(this);
        obj = a.create();
        i = ((Dialog) (obj));
        if (bundle != null)
        {
            ((Dialog) (obj)).onRestoreInstanceState(bundle);
        }
        ((Dialog) (obj)).setOnDismissListener(this);
        ((Dialog) (obj)).show();
    }

    protected void a(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(hji))
        {
            super.a(parcelable);
        } else
        {
            parcelable = (hji)parcelable;
            super.a(parcelable.getSuperState());
            if (((hji) (parcelable)).a)
            {
                a(((hji) (parcelable)).b);
                return;
            }
        }
    }

    public void a(CharSequence charsequence)
    {
        c = charsequence;
    }

    protected void a(boolean flag)
    {
    }

    protected void b(View view)
    {
        view = view.findViewById(o.i);
        if (view != null)
        {
            CharSequence charsequence = a();
            byte byte0 = 8;
            if (!TextUtils.isEmpty(charsequence))
            {
                if (view instanceof TextView)
                {
                    ((TextView)view).setText(charsequence);
                }
                byte0 = 0;
            }
            if (view.getVisibility() != byte0)
            {
                view.setVisibility(byte0);
            }
        }
    }

    protected View c()
    {
        if (h == 0)
        {
            return null;
        } else
        {
            return LayoutInflater.from(a.getContext()).inflate(h, null);
        }
    }

    public void d()
    {
        if (i == null || !i.isShowing())
        {
            return;
        } else
        {
            i.dismiss();
            return;
        }
    }

    protected Parcelable e()
    {
        Object obj = super.e();
        if (i == null || !i.isShowing())
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new hji(((Parcelable) (obj)));
            obj.a = true;
            obj.b = i.onSaveInstanceState();
            return ((Parcelable) (obj));
        }
    }

    public void onClick(DialogInterface dialoginterface, int k)
    {
        j = k;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        B().b(this);
        i = null;
        boolean flag;
        if (j == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    protected void z_()
    {
        if (i != null && i.isShowing())
        {
            return;
        } else
        {
            a(((Bundle) (null)));
            return;
        }
    }
}
