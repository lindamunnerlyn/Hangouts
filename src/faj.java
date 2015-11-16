// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ApplicationErrorReport;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;

public final class faj
    implements android.os.Parcelable.Creator
{

    public faj()
    {
    }

    public static void a(ErrorReport errorreport, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, errorreport.a);
        g.a(parcel, 2, errorreport.b, i);
        g.a(parcel, 3, errorreport.c);
        g.b(parcel, 4, errorreport.d);
        g.a(parcel, 5, errorreport.e);
        g.a(parcel, 6, errorreport.f);
        g.a(parcel, 7, errorreport.g);
        g.a(parcel, 8, errorreport.h);
        g.a(parcel, 9, errorreport.i);
        g.a(parcel, 10, errorreport.j);
        g.a(parcel, 11, errorreport.k);
        g.b(parcel, 12, errorreport.l);
        g.a(parcel, 13, errorreport.m);
        g.a(parcel, 14, errorreport.n);
        g.a(parcel, 15, errorreport.o);
        g.a(parcel, 17, errorreport.q);
        g.a(parcel, 16, errorreport.p);
        g.a(parcel, 19, errorreport.s);
        g.a(parcel, 18, errorreport.r);
        g.a(parcel, 21, errorreport.u);
        g.a(parcel, 20, errorreport.t);
        g.a(parcel, 23, errorreport.w);
        g.a(parcel, 22, errorreport.v);
        g.b(parcel, 25, errorreport.y);
        g.b(parcel, 24, errorreport.x);
        g.b(parcel, 27, errorreport.A);
        g.b(parcel, 26, errorreport.z);
        g.a(parcel, 29, errorreport.C);
        g.a(parcel, 28, errorreport.B);
        g.a(parcel, 31, errorreport.E);
        g.a(parcel, 30, errorreport.D);
        g.b(parcel, 34, errorreport.H);
        g.a(parcel, 35, errorreport.I);
        g.a(parcel, 32, errorreport.F);
        g.b(parcel, 33, errorreport.G);
        g.b(parcel, 38, errorreport.L);
        g.a(parcel, 39, errorreport.M);
        g.a(parcel, 36, errorreport.J);
        g.a(parcel, 37, errorreport.K);
        g.a(parcel, 42, errorreport.P);
        g.a(parcel, 43, errorreport.Q);
        g.a(parcel, 40, errorreport.N);
        g.a(parcel, 41, errorreport.O);
        g.a(parcel, 46, errorreport.T, i);
        g.a(parcel, 47, errorreport.U);
        g.a(parcel, 44, errorreport.R);
        g.a(parcel, 45, errorreport.S);
        g.a(parcel, 51, errorreport.Y);
        g.a(parcel, 50, errorreport.X);
        g.a(parcel, 49, errorreport.W);
        g.a(parcel, 48, errorreport.V, i);
        g.a(parcel, 55, errorreport.ac);
        g.a(parcel, 54, errorreport.ab);
        g.a(parcel, 53, errorreport.aa, i);
        g.a(parcel, 52, errorreport.Z, i);
        g.a(parcel, 56, errorreport.ad);
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int k2 = g.a(parcel);
        int j2 = 0;
        ApplicationErrorReport applicationerrorreport = null;
        String s29 = null;
        int i2 = 0;
        String s28 = null;
        String s27 = null;
        String s26 = null;
        String s25 = null;
        String s24 = null;
        String s23 = null;
        String s22 = null;
        int l1 = 0;
        String s21 = null;
        String s20 = null;
        String s19 = null;
        String s18 = null;
        String s17 = null;
        String as3[] = null;
        String as2[] = null;
        String as1[] = null;
        String s16 = null;
        String s15 = null;
        byte abyte0[] = null;
        int k1 = 0;
        int j1 = 0;
        int i1 = 0;
        int l = 0;
        String s14 = null;
        String s13 = null;
        String s12 = null;
        android.os.Bundle bundle1 = null;
        boolean flag3 = false;
        int k = 0;
        int j = 0;
        boolean flag2 = false;
        String s11 = null;
        String s10 = null;
        int i = 0;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        BitmapTeleporter bitmapteleporter = null;
        String s2 = null;
        FileTeleporter afileteleporter[] = null;
        String as[] = null;
        boolean flag1 = false;
        String s1 = null;
        ThemeSettings themesettings = null;
        LogOptions logoptions = null;
        String s = null;
        boolean flag = false;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < k2)
            {
                int l2 = parcel.readInt();
                switch (0xffff & l2)
                {
                default:
                    g.b(parcel, l2);
                    break;

                case 1: // '\001'
                    j2 = g.e(parcel, l2);
                    break;

                case 2: // '\002'
                    applicationerrorreport = (ApplicationErrorReport)g.a(parcel, l2, ApplicationErrorReport.CREATOR);
                    break;

                case 3: // '\003'
                    s29 = g.i(parcel, l2);
                    break;

                case 4: // '\004'
                    i2 = g.e(parcel, l2);
                    break;

                case 5: // '\005'
                    s28 = g.i(parcel, l2);
                    break;

                case 6: // '\006'
                    s27 = g.i(parcel, l2);
                    break;

                case 7: // '\007'
                    s26 = g.i(parcel, l2);
                    break;

                case 8: // '\b'
                    s25 = g.i(parcel, l2);
                    break;

                case 9: // '\t'
                    s24 = g.i(parcel, l2);
                    break;

                case 10: // '\n'
                    s23 = g.i(parcel, l2);
                    break;

                case 11: // '\013'
                    s22 = g.i(parcel, l2);
                    break;

                case 12: // '\f'
                    l1 = g.e(parcel, l2);
                    break;

                case 13: // '\r'
                    s21 = g.i(parcel, l2);
                    break;

                case 14: // '\016'
                    s20 = g.i(parcel, l2);
                    break;

                case 15: // '\017'
                    s19 = g.i(parcel, l2);
                    break;

                case 17: // '\021'
                    s17 = g.i(parcel, l2);
                    break;

                case 16: // '\020'
                    s18 = g.i(parcel, l2);
                    break;

                case 19: // '\023'
                    as2 = g.m(parcel, l2);
                    break;

                case 18: // '\022'
                    as3 = g.m(parcel, l2);
                    break;

                case 21: // '\025'
                    s16 = g.i(parcel, l2);
                    break;

                case 20: // '\024'
                    as1 = g.m(parcel, l2);
                    break;

                case 23: // '\027'
                    abyte0 = g.l(parcel, l2);
                    break;

                case 22: // '\026'
                    s15 = g.i(parcel, l2);
                    break;

                case 25: // '\031'
                    j1 = g.e(parcel, l2);
                    break;

                case 24: // '\030'
                    k1 = g.e(parcel, l2);
                    break;

                case 27: // '\033'
                    l = g.e(parcel, l2);
                    break;

                case 26: // '\032'
                    i1 = g.e(parcel, l2);
                    break;

                case 29: // '\035'
                    s13 = g.i(parcel, l2);
                    break;

                case 28: // '\034'
                    s14 = g.i(parcel, l2);
                    break;

                case 31: // '\037'
                    bundle1 = g.k(parcel, l2);
                    break;

                case 30: // '\036'
                    s12 = g.i(parcel, l2);
                    break;

                case 34: // '"'
                    j = g.e(parcel, l2);
                    break;

                case 35: // '#'
                    flag2 = g.c(parcel, l2);
                    break;

                case 32: // ' '
                    flag3 = g.c(parcel, l2);
                    break;

                case 33: // '!'
                    k = g.e(parcel, l2);
                    break;

                case 38: // '&'
                    i = g.e(parcel, l2);
                    break;

                case 39: // '\''
                    s9 = g.i(parcel, l2);
                    break;

                case 36: // '$'
                    s11 = g.i(parcel, l2);
                    break;

                case 37: // '%'
                    s10 = g.i(parcel, l2);
                    break;

                case 42: // '*'
                    s6 = g.i(parcel, l2);
                    break;

                case 43: // '+'
                    s5 = g.i(parcel, l2);
                    break;

                case 40: // '('
                    s8 = g.i(parcel, l2);
                    break;

                case 41: // ')'
                    s7 = g.i(parcel, l2);
                    break;

                case 46: // '.'
                    bitmapteleporter = (BitmapTeleporter)g.a(parcel, l2, BitmapTeleporter.CREATOR);
                    break;

                case 47: // '/'
                    s2 = g.i(parcel, l2);
                    break;

                case 44: // ','
                    s4 = g.i(parcel, l2);
                    break;

                case 45: // '-'
                    s3 = g.i(parcel, l2);
                    break;

                case 51: // '3'
                    s1 = g.i(parcel, l2);
                    break;

                case 50: // '2'
                    flag1 = g.c(parcel, l2);
                    break;

                case 49: // '1'
                    as = g.m(parcel, l2);
                    break;

                case 48: // '0'
                    afileteleporter = (FileTeleporter[])g.b(parcel, l2, FileTeleporter.CREATOR);
                    break;

                case 55: // '7'
                    flag = g.c(parcel, l2);
                    break;

                case 54: // '6'
                    s = g.i(parcel, l2);
                    break;

                case 53: // '5'
                    logoptions = (LogOptions)g.a(parcel, l2, LogOptions.CREATOR);
                    break;

                case 52: // '4'
                    themesettings = (ThemeSettings)g.a(parcel, l2, ThemeSettings.CREATOR);
                    break;

                case 56: // '8'
                    bundle = g.k(parcel, l2);
                    break;
                }
            } else
            if (parcel.dataPosition() != k2)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k2).toString(), parcel);
            } else
            {
                return new ErrorReport(j2, applicationerrorreport, s29, i2, s28, s27, s26, s25, s24, s23, s22, l1, s21, s20, s19, s18, s17, as3, as2, as1, s16, s15, abyte0, k1, j1, i1, l, s14, s13, s12, bundle1, flag3, k, j, flag2, s11, s10, i, s9, s8, s7, s6, s5, s4, s3, bitmapteleporter, s2, afileteleporter, as, flag1, s1, themesettings, logoptions, s, flag, bundle);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new ErrorReport[i];
    }
}
