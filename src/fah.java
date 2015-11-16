// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

public class fah
{

    private Bitmap a;
    private String b;
    private Bundle c;
    private String d;
    private String e;
    private ArrayList f;
    private boolean g;
    private ThemeSettings h;
    private LogOptions i;

    public fah()
    {
        c = new Bundle();
        f = new ArrayList();
    }

    public FeedbackOptions a()
    {
        return FeedbackOptions.a(FeedbackOptions.a(FeedbackOptions.a(FeedbackOptions.a(FeedbackOptions.c(FeedbackOptions.a(FeedbackOptions.b(FeedbackOptions.a(FeedbackOptions.a(new FeedbackOptions(), a), b), d), c), e), f), g), h), i);
    }

    public fah a(Bitmap bitmap)
    {
        a = bitmap;
        return this;
    }

    public fah a(Bundle bundle)
    {
        if (bundle != null)
        {
            c.putAll(bundle);
        }
        return this;
    }

    public fah a(String s)
    {
        b = s;
        return this;
    }

    public fah a(String s, String s1)
    {
        c.putString(s, s1);
        return this;
    }

    public fah b(String s)
    {
        d = s;
        return this;
    }

    public fah c(String s)
    {
        e = s;
        return this;
    }
}
