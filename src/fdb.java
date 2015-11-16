// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.feedback.FeedbackOptions;

public final class fdb
{

    public static final emt a;
    private static final emx b;
    private static final emu c;

    static emx a()
    {
        return b;
    }

    public static ene a(emy emy1, FeedbackOptions feedbackoptions)
    {
        return emy1.a(new fdd(emy1, feedbackoptions));
    }

    static 
    {
        b = new emx();
        c = new fdc();
        a = new emt("Feedback.API", c, b);
    }
}
