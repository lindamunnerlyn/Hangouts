// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.feedback.FeedbackOptions;

public final class fad
{

    public static final ejs a;
    private static final ejw b;
    private static final ejt c;

    static ejw a()
    {
        return b;
    }

    public static ekd a(ejx ejx1, FeedbackOptions feedbackoptions)
    {
        return ejx1.a(new faf(ejx1, feedbackoptions));
    }

    static 
    {
        b = new ejw();
        c = new fae();
        a = new ejs("Feedback.API", c, b);
    }
}
