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

public class heq extends hfa
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, hfr
{

    private android.app.AlertDialog.Builder b;
    private CharSequence c;
    private CharSequence d;
    private Drawable e;
    private CharSequence f;
    private CharSequence g;
    private int h;
    private Dialog i;
    private int j;

    public heq(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.ti);
    }

    private heq(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        context = context.obtainStyledAttributes(attributeset, hga.T, k, 0);
        c = context.getString(hga.X);
        if (c == null)
        {
            c = o();
        }
        d = context.getString(hga.W);
        e = context.getDrawable(hga.U);
        f = context.getString(hga.Z);
        g = context.getString(hga.Y);
        h = context.getResourceId(hga.V, h);
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
        b = (new android.app.AlertDialog.Builder(((Context) (obj)))).setTitle(c).setIcon(e).setPositiveButton(f, this).setNegativeButton(g, this);
        obj = c();
        if (obj != null)
        {
            b(((View) (obj)));
            b.setView(((View) (obj)));
        } else
        {
            b.setMessage(d);
        }
        a(b);
        B().a(this);
        obj = b.create();
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
        if (parcelable == null || !parcelable.getClass().equals(her))
        {
            super.a(parcelable);
        } else
        {
            parcelable = (her)parcelable;
            super.a(parcelable.getSuperState());
            if (((her) (parcelable)).a)
            {
                a(((her) (parcelable)).b);
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

    protected void b()
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

    protected void b(View view)
    {
        view = view.findViewById(o.G);
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
            return LayoutInflater.from(b.getContext()).inflate(h, null);
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
            obj = new her(((Parcelable) (obj)));
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
}
