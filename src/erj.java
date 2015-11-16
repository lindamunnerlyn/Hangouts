// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.stats.ConnectionEvent;

public final class erj
    implements android.os.Parcelable.Creator
{

    public erj()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int k = g.a(parcel);
        int j = 0;
        long l3 = 0L;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        long l2 = 0L;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 3: // '\003'
                case 9: // '\t'
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    l3 = g.f(parcel, l);
                    break;

                case 4: // '\004'
                    s5 = g.i(parcel, l);
                    break;

                case 5: // '\005'
                    s4 = g.i(parcel, l);
                    break;

                case 6: // '\006'
                    s3 = g.i(parcel, l);
                    break;

                case 7: // '\007'
                    s2 = g.i(parcel, l);
                    break;

                case 8: // '\b'
                    s1 = g.i(parcel, l);
                    break;

                case 10: // '\n'
                    l2 = g.f(parcel, l);
                    break;

                case 11: // '\013'
                    l1 = g.f(parcel, l);
                    break;

                case 12: // '\f'
                    i = g.e(parcel, l);
                    break;

                case 13: // '\r'
                    s = g.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ConnectionEvent(j, l3, i, s5, s4, s3, s2, s1, s, l2, l1);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new ConnectionEvent[i];
    }
}
