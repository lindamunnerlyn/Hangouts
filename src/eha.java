// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.TextView;

public class eha
{

    private static eha a = null;

    public eha()
    {
    }

    public static eha a(Context context)
    {
        if (a == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                a = new eha();
            } else
            {
                a = new ehb(context.getApplicationContext());
            }
        }
        return a;
    }

    public int a(int i)
    {
        throw new UnsupportedOperationException();
    }

    public SpannableString a(CharSequence charsequence, TextView textview)
    {
        return null;
    }

    public void a(Spannable spannable, TextView textview)
    {
    }

    public void a(Spanned spanned)
    {
    }

}
