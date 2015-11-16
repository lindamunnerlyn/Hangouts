// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class ftr
    implements android.os.Parcelable.Creator
{

    public ftr()
    {
    }

    public Object createFromParcel(Parcel parcel)
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

    public Object[] newArray(int i)
    {
        return new PlayLoggerContext[i];
    }
}
