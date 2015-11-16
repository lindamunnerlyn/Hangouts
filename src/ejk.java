// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.widget.TextView;

public class ejk
{

    public final TextView a;
    private CharSequence b;

    public ejk(TextView textview)
    {
        a = textview;
    }

    public void a()
    {
        b = null;
        b();
    }

    public void a(String s, String s1)
    {
    }

    public void b()
    {
        int i;
        if (!TextUtils.isEmpty(b))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        a.setVisibility(i);
        a.setText(b);
    }
}
