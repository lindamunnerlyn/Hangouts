// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;

public class hjk extends hjh
{

    int a;
    private CharSequence c[];
    private CharSequence d[];
    private String e;
    private String f;
    private boolean g;

    public hjk(Context context)
    {
        this(context, null);
    }

    public hjk(Context context, AttributeSet attributeset)
    {
        super(context, null);
        attributeset = context.obtainStyledAttributes(null, hkr.aa, 0, 0);
        c = attributeset.getTextArray(hkr.ab);
        d = attributeset.getTextArray(hkr.ac);
        attributeset.recycle();
        context = context.obtainStyledAttributes(null, hkr.ad, 0, 0);
        f = context.getString(hkr.ap);
        context.recycle();
    }

    private int H()
    {
        return b(e);
    }

    protected Object a(TypedArray typedarray, int j)
    {
        return typedarray.getString(j);
    }

    public void a(android.app.AlertDialog.Builder builder)
    {
        super.a(builder);
        if (c == null || d == null)
        {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        } else
        {
            a = H();
            builder.setSingleChoiceItems(c, a, new hjl(this));
            builder.setPositiveButton(null, null);
            return;
        }
    }

    protected void a(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(hjm))
        {
            super.a(parcelable);
            return;
        } else
        {
            parcelable = (hjm)parcelable;
            super.a(parcelable.getSuperState());
            a(((hjm) (parcelable)).a);
            return;
        }
    }

    public void a(String s)
    {
        boolean flag;
        if (!TextUtils.equals(e, s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || !g)
        {
            e = s;
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
        if (flag && a >= 0 && d != null)
        {
            String s = d[a].toString();
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
            obj = g(e);
        } else
        {
            obj = (String)obj;
        }
        a(((String) (obj)));
    }

    public int b(String s)
    {
        if (s != null && d != null)
        {
            for (int j = d.length - 1; j >= 0; j--)
            {
                if (d[j].equals(s))
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
        if (charsequence == null && f != null)
        {
            f = null;
        } else
        if (charsequence != null && !charsequence.equals(f))
        {
            f = charsequence.toString();
            return;
        }
    }

    public void b(CharSequence acharsequence[])
    {
        c = acharsequence;
    }

    public void c(int j)
    {
        c(x().getResources().getTextArray(j));
    }

    public void c(CharSequence acharsequence[])
    {
        d = acharsequence;
    }

    protected Parcelable e()
    {
        Object obj = super.e();
        if (u())
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new hjm(((Parcelable) (obj)));
            obj.a = h();
            return ((Parcelable) (obj));
        }
    }

    public CharSequence[] f()
    {
        return c;
    }

    public CharSequence g()
    {
        CharSequence charsequence = i();
        if (f == null || charsequence == null)
        {
            return super.g();
        } else
        {
            return String.format(f, new Object[] {
                charsequence
            });
        }
    }

    public String h()
    {
        return e;
    }

    public CharSequence i()
    {
        int j = H();
        if (j >= 0 && c != null)
        {
            return c[j];
        } else
        {
            return null;
        }
    }
}
