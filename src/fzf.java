// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;

public class fzf
{

    public FeedbackOptions a;

    public fzf(FeedbackOptions feedbackoptions)
    {
        a = feedbackoptions;
    }

    public Bitmap a()
    {
        return a.g().a();
    }

    public FeedbackOptions b()
    {
        return a;
    }
}
