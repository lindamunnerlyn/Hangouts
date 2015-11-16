// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class fxq
    implements android.os.Parcelable.Creator
{

    public fxq()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = g.a(parcel);
        byte abyte0[] = null;
        String s1 = null;
        int j = 0;
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
                    s1 = g.i(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = g.l(parcel, l);
                    break;

                case 5: // '\005'
                    s = g.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new MessageEventParcelable(j, i, s1, abyte0, s);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new MessageEventParcelable[i];
    }
}
