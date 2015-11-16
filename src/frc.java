// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class frc
    implements android.os.Parcelable.Creator
{

    public frc()
    {
    }

    public static PlayLoggerContext a(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int i1 = g.a(parcel);
        boolean flag1 = true;
        boolean flag = false;
        String s1 = null;
        String s2 = null;
        int j = 0;
        int k = 0;
        String s3 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    g.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = g.e(parcel, j1);
                    break;

                case 2: // '\002'
                    s3 = g.i(parcel, j1);
                    break;

                case 3: // '\003'
                    k = g.e(parcel, j1);
                    break;

                case 4: // '\004'
                    j = g.e(parcel, j1);
                    break;

                case 5: // '\005'
                    s2 = g.i(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = g.i(parcel, j1);
                    break;

                case 7: // '\007'
                    flag1 = g.c(parcel, j1);
                    break;

                case 8: // '\b'
                    s = g.i(parcel, j1);
                    break;

                case 9: // '\t'
                    flag = g.c(parcel, j1);
                    break;

                case 10: // '\n'
                    i = g.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new PlayLoggerContext(l, s3, k, j, s2, s1, flag1, s, flag, i);
            }
        } while (true);
    }

    public static void a(PlayLoggerContext playloggercontext, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, playloggercontext.a);
        g.a(parcel, 2, playloggercontext.b);
        g.b(parcel, 3, playloggercontext.c);
        g.b(parcel, 4, playloggercontext.d);
        g.a(parcel, 5, playloggercontext.e);
        g.a(parcel, 6, playloggercontext.f);
        g.a(parcel, 7, playloggercontext.g);
        g.a(parcel, 8, playloggercontext.h);
        g.a(parcel, 9, playloggercontext.i);
        g.b(parcel, 10, playloggercontext.j);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new PlayLoggerContext[i];
    }
}
