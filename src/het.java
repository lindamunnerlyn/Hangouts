// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;

public class het extends heq
{

    private CharSequence b[];
    private CharSequence c[];
    private String d;
    private String e;
    private int f;
    private boolean g;

    public het(Context context)
    {
        this(context, null);
    }

    public het(Context context, AttributeSet attributeset)
    {
        super(context, null);
        attributeset = context.obtainStyledAttributes(null, hga.aa, 0, 0);
        b = attributeset.getTextArray(hga.ab);
        c = attributeset.getTextArray(hga.ac);
        attributeset.recycle();
        context = context.obtainStyledAttributes(null, hga.ad, 0, 0);
        e = context.getString(hga.ap);
        context.recycle();
    }

    private int H()
    {
        return b(d);
    }

    static int a(het het1, int j)
    {
        het1.f = j;
        return j;
    }

    protected Object a(TypedArray typedarray, int j)
    {
        return typedarray.getString(j);
    }

    public void a(android.app.AlertDialog.Builder builder)
    {
        super.a(builder);
        if (b == null || c == null)
        {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        } else
        {
            f = H();
            builder.setSingleChoiceItems(b, f, new heu(this));
            builder.setPositiveButton(null, null);
            return;
        }
    }

    protected void a(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(hev))
        {
            super.a(parcelable);
            return;
        } else
        {
            parcelable = (hev)parcelable;
            super.a(parcelable.getSuperState());
            a(((hev) (parcelable)).a);
            return;
        }
    }

    public void a(String s)
    {
        boolean flag;
        if (!TextUtils.equals(d, s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || !g)
        {
            d = s;
            g = true;
            f(s);
            if (flag)
            {
                z();
            }
        }
    }

    protected void a(boolean flag)
    {
        super.a(flag);
        if (flag && f >= 0 && c != null)
        {
            String s = c[f].toString();
            if (a(s))
            {
                a(s);
            }
        }
    }

    protected void a(boolean flag, Object obj)
    {
        if (flag)
        {
            obj = g(d);
        } else
        {
            obj = (String)obj;
        }
        a(((String) (obj)));
    }

    public int b(String s)
    {
        if (s != null && c != null)
        {
            for (int j = c.length - 1; j >= 0; j--)
            {
                if (c[j].equals(s))
                {
                    return j;
                }
            }

        }
        return -1;
    }

    public void b(int j)
    {
        b(x().getResources().getTextArray(j));
    }

    public void b(CharSequence charsequence)
    {
        super.b(charsequence);
        if (charsequence == null && e != null)
        {
            e = null;
        } else
        if (charsequence != null && !charsequence.equals(e))
        {
            e = charsequence.toString();
            return;
        }
    }

    public void b(CharSequence acharsequence[])
    {
        b = acharsequence;
    }

    public void c(int j)
    {
        c(x().getResources().getTextArray(j));
    }

    public void c(CharSequence acharsequence[])
    {
        c = acharsequence;
    }

    protected Parcelable e()
    {
        Object obj = super.e();
        if (u())
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new hev(((Parcelable) (obj)));
            obj.a = h();
            return ((Parcelable) (obj));
        }
    }

    public CharSequence[] f()
    {
        return b;
    }

    public CharSequence g()
    {
        CharSequence charsequence = i();
        if (e == null || charsequence == null)
        {
            return super.g();
        } else
        {
            return String.format(e, new Object[] {
                charsequence
            });
        }
    }

    public String h()
    {
        return d;
    }

    public CharSequence i()
    {
        int j = H();
        if (j >= 0 && b != null)
        {
            return b[j];
        } else
        {
            return null;
        }
    }
}
