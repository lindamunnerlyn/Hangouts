// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.ConnectionConfiguration;

public final class fzb
    implements android.os.Parcelable.Creator
{

    public fzb()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = g.a(parcel);
        String s1 = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        int j = 0;
        String s2 = null;
        String s3 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    g.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = g.e(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = g.i(parcel, i1);
                    break;

                case 3: // '\003'
                    s2 = g.i(parcel, i1);
                    break;

                case 4: // '\004'
                    j = g.e(parcel, i1);
                    break;

                case 5: // '\005'
                    i = g.e(parcel, i1);
                    break;

                case 6: // '\006'
                    flag2 = g.c(parcel, i1);
                    break;

                case 7: // '\007'
                    flag1 = g.c(parcel, i1);
                    break;

                case 8: // '\b'
                    s1 = g.i(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = g.c(parcel, i1);
                    break;

                case 10: // '\n'
                    s = g.i(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ConnectionConfiguration(k, s3, s2, j, i, flag2, flag1, s1, flag, s);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new ConnectionConfiguration[i];
    }
}
