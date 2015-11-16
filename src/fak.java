// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ApplicationErrorReport;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;

public final class fak
    implements android.os.Parcelable.Creator
{

    public fak()
    {
    }

    public static void a(FeedbackOptions feedbackoptions, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, feedbackoptions.a);
        g.a(parcel, 2, feedbackoptions.b);
        g.a(parcel, 3, feedbackoptions.c);
        g.a(parcel, 5, feedbackoptions.d);
        g.a(parcel, 6, feedbackoptions.e, i);
        g.a(parcel, 7, feedbackoptions.f);
        g.a(parcel, 8, feedbackoptions.g, i);
        g.a(parcel, 9, feedbackoptions.h);
        g.c(parcel, 10, feedbackoptions.i);
        g.a(parcel, 11, feedbackoptions.j);
        g.a(parcel, 12, feedbackoptions.k, i);
        g.a(parcel, 13, feedbackoptions.l, i);
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = g.a(parcel);
        int i = 0;
        String s3 = null;
        android.os.Bundle bundle = null;
        String s2 = null;
        ApplicationErrorReport applicationerrorreport = null;
        String s1 = null;
        BitmapTeleporter bitmapteleporter = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        ThemeSettings themesettings = null;
        LogOptions logoptions = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 4: // '\004'
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = g.i(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = g.k(parcel, k);
                    break;

                case 5: // '\005'
                    s2 = g.i(parcel, k);
                    break;

                case 6: // '\006'
                    applicationerrorreport = (ApplicationErrorReport)g.a(parcel, k, ApplicationErrorReport.CREATOR);
                    break;

                case 7: // '\007'
                    s1 = g.i(parcel, k);
                    break;

                case 8: // '\b'
                    bitmapteleporter = (BitmapTeleporter)g.a(parcel, k, BitmapTeleporter.CREATOR);
                    break;

                case 9: // '\t'
                    s = g.i(parcel, k);
                    break;

                case 10: // '\n'
                    arraylist = g.c(parcel, k, FileTeleporter.CREATOR);
                    break;

                case 11: // '\013'
                    flag = g.c(parcel, k);
                    break;

                case 12: // '\f'
                    themesettings = (ThemeSettings)g.a(parcel, k, ThemeSettings.CREATOR);
                    break;

                case 13: // '\r'
                    logoptions = (LogOptions)g.a(parcel, k, LogOptions.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FeedbackOptions(i, s3, bundle, s2, applicationerrorreport, s1, bitmapteleporter, s, arraylist, flag, themesettings, logoptions);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new FeedbackOptions[i];
    }
}
