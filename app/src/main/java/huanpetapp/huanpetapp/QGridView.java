package huanpetapp.huanpetapp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by 鬼鬼 on 2018/3/26.
 */

public class QGridView extends GridView {
    public QGridView(Context context) {
        super(context);
    }

    public QGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public QGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, expandSpec);

    }
}
