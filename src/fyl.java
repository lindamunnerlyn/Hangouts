// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;

public final class fyl
    implements android.os.Parcelable.Creator
{

    public fyl()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int k = g.a(parcel);
        int j = 0;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        byte byte3 = 0;
        byte byte2 = 0;
        byte byte1 = 0;
        byte byte0 = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    i = g.e(parcel, l);
                    break;

                case 3: // '\003'
                    s5 = g.i(parcel, l);
                    break;

                case 4: // '\004'
                    s4 = g.i(parcel, l);
                    break;

                case 5: // '\005'
                    s3 = g.i(parcel, l);
                    break;

                case 6: // '\006'
                    s2 = g.i(parcel, l);
                    break;

                case 7: // '\007'
                    s1 = g.i(parcel, l);
                    break;

                case 8: // '\b'
                    s = g.i(parcel, l);
                    break;

                case 9: // '\t'
                    byte3 = g.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte2 = g.d(parcel, l);
                    break;

                case 11: // '\013'
                    byte1 = g.d(parcel, l);
                    break;

                case 12: // '\f'
                    byte0 = g.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AncsNotificationParcelable(j, i, s5, s4, s3, s2, s1, s, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new AncsNotificationParcelable[i];
    }
}
