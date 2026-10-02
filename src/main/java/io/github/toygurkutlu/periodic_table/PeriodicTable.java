package io.github.toygurkutlu.periodic_table;

import io.github.toygurkutlu.periodic_table.domain.Dictionary;
import io.github.toygurkutlu.periodic_table.domain.Keys;
import io.github.toygurkutlu.periodic_table.records.*;

import javax.swing.Timer;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.*;
import java.util.prefs.Preferences;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A customizable Periodic Table component that extends {@code JPanel}. Instances of this class
 * can be added directly to any {@code Swing} container.
 *
 * <p>This component integrates both the Periodic Table and an Element Detail Panel. When an element
 * in the Periodic Table is clicked, the detail panel updates automatically. Users can also show or
 * hide the Element Detail Panel by clicking the collapse icon. Additionally, any detail text
 * within the panel can be copied to the clipboard simply by clicking it.</p>
 *
 * <p>In addition, molecular weights can be calculated using the
 * {@link #calculateMolecularWeight(Element[], int[])} method.</p>
 *
 * <p>Use the {@link #setAttribute(CustomisationAttribute, Object)} main method for available any customizable
 * attribute or use the following methods to customize attributes:</p>
 * <ol>
 *     <li><strong>Background (Periodic Table background):</strong>
 *         <ul>
 *             <li>{@link #setBackgroundColor(Color)}</li>
 *         </ul>
 *     </li>
 *     <li><strong>Element classifications and elements:</strong>
 *         <ul>
 *             <li>{@link #setTextFont(Font)}</li>
 *             <li>{@link #setActinideBackground(Color)}</li>
 *             <li>{@link #setActinideForeground(Color)}</li>
 *             <li>{@link #setAlkaliMetalBackground(Color)}</li>
 *             <li>{@link #setAlkaliMetalForeground(Color)}</li>
 *             <li>{@link #setAlkalineEarthMetalBackground(Color)}</li>
 *             <li>{@link #setAlkalineEarthMetalForeground(Color)}</li>
 *             <li>{@link #setHalogenBackground(Color)}</li>
 *             <li>{@link #setHalogenForeground(Color)}</li>
 *             <li>{@link #setLanthanideBackground(Color)}</li>
 *             <li>{@link #setLanthanideForeground(Color)}</li>
 *             <li>{@link #setMetalloidBackground(Color)}</li>
 *             <li>{@link #setMetalloidForeground(Color)}</li>
 *             <li>{@link #setNobleGasBackground(Color)}</li>
 *             <li>{@link #setNobleGasForeground(Color)}</li>
 *             <li>{@link #setNonMetalBackground(Color)}</li>
 *             <li>{@link #setNonMetalForeground(Color)}</li>
 *             <li>{@link #setPostTransitionMetalBackground(Color)}</li>
 *             <li>{@link #setPostTransitionMetalForeground(Color)}</li>
 *             <li>{@link #setTransitionMetalBackground(Color)}</li>
 *             <li>{@link #setTransitionMetalForeground(Color)}</li>
 *         </ul>
 *     </li>
 *     <li><strong>Highlighting (hover effect) current element when mouse cursor enters the boundaries of the element box:</strong>
 *         <ul>
 *             <li>{@link #setElementHoverBackground(Color)}</li>
 *             <li>{@link #setElementHoverForeground(Color)}</li>
 *         </ul>
 *     </li>
 *     <li><strong>Collapse icon:</strong>
 *         <ul>
 *             <li>{@link #setCollapseIconColor(Color)}</li>
 *             <li>{@link #setCollapseIconHoverColor(Color)}</li>
 *         </ul>
 *     </li>
 *     <li><strong>Detail panel:</strong>
 *         <ul>
 *             <li>{@link #setDetailPanelBackground(Color)}</li>
 *             <li>{@link #setDetailPanelForeground(Color)}</li>
 *             <li>{@link #setDetailPanelHoverForeground(Color)}</li>
 *             <li>{@link #setDetailPanelFont(Font)}</li>
 *         </ul>
 *     </li>
 *     <li><strong>Tooltip:</strong>
 *         <ul>
 *             <li>{@link #setTooltipBackground(Color)}</li>
 *             <li>{@link #setTooltipForeground(Color)}</li>
 *             <li>{@link #setTooltipFont(Font)}</li>
 *             <li>{@link #setTooltipBorderColor(Color)}</li>
 *             <li>{@link #setTooltipCornerRadius(int)}</li>
 *         </ul>
 *     </li>
 *     <li><strong>ScrollBars:</strong>
 *         <ul>
 *             <li>{@link #setScrollBarTrackColor(Color)}</li>
 *             <li>{@link #setScrollBarThumbColor(Color)}</li>
 *             <li>{@link #setScrollBarThumbDragColor(Color)}</li>
 *             <li>{@link #setScrollBarThumbRadius(int)}</li>
 *             <li>{@link #setScrollBarCornerColor(Color)}</li>
 *             <li>{@link #setScrollBarVerticalKnobHeight(int)}</li>
 *             <li>{@link #setScrollBarHorizontalKnobWidth(int)}</li>
 *         </ul>
 *     </li>
 * </ol>
 */
public class PeriodicTable extends JPanel {

    public enum CustomisationAttribute {
        /**
         * Represents the background for the periodic table.
         */
        BACKGROUND,
        /**
         * Represents the background for the elements when mouse cursor enters the boundaries of the element box.
         */
        ELEMENT_HOVER_BACKGROUND,
        /**
         * Represents the foreground for the elements when mouse cursor enters the boundaries of the element box.
         */
        ELEMENT_HOVER_FOREGROUND,
        /**
         * Represents the font for the elements and the element classifications.
         */
        FONT,
        /**
         * Represents the background for the element detail panel.
         */
        DETAIL_PANEL_BACKGROUND,
        /**
         * Represents the foreground for the element detail panel.
         */
        DETAIL_PANEL_FOREGROUND,
        /**
         * Represents the foreground for the detail when mouse cursor enters the boundaries of the element detail.
         */
        DETAIL_PANEL_HOVER_FOREGROUND,
        /**
         * Represents the font for the element detail panel.
         */
        DETAIL_PANEL_FONT,
        /**
         * Represents the background for the Actinides.
         */
        ACTINIDE_BACKGROUND,
        /**
         * Represents the foreground for the Actinides.
         */
        ACTINIDE_FOREGROUND,
        /**
         * Represents the background for the Alkali metals.
         */
        ALKALI_METAL_BACKGROUND,
        /**
         * Represents the foregrounds for the Alkali metals.
         */
        ALKALI_METAL_FOREGROUND,
        /**
         * Represents the background for the Alkaline earth metals.
         */
        ALKALINE_EARTH_METAL_BACKGROUND,
        /**
         * Represents the foregrounds for the Alkaline earth metals.
         */
        ALKALINE_EARTH_METAL_FOREGROUND,
        /**
         * Represents the background for the Halogens.
         */
        HALOGEN_BACKGROUND,
        /**
         * Represents the foregrounds for the Halogens.
         */
        HALOGEN_FOREGROUND,
        /**
         * Represents the background for the Lanthanides.
         */
        LANTHANIDE_BACKGROUND,
        /**
         * Represents the foregrounds for the Lanthanides.
         */
        LANTHANIDE_FOREGROUND,
        /**
         * Represents the background for the Metalloids.
         */
        METALLOID_BACKGROUND,
        /**
         * Represents the foregrounds for the Metalloids.
         */
        METALLOID_FOREGROUND,
        /**
         * Represents the background for the Noble gases.
         */
        NOBLE_GAS_BACKGROUND,
        /**
         * Represents the foregrounds for the Noble gases.
         */
        NOBLE_GAS_FOREGROUND,
        /**
         * Represents the background for the Non-metals.
         */
        NON_METAL_BACKGROUND,
        /**
         * Represents the foregrounds for the Non-metals.
         */
        NON_METAL_FOREGROUND,
        /**
         * Represents the background for the Post-transition metals.
         */
        POST_TRANSITION_METAL_BACKGROUND,
        /**
         * Represents the foregrounds for the Post-transition metals.
         */
        POST_TRANSITION_METAL_FOREGROUND,
        /**
         * Represents the background for the Transition metals.
         */
        TRANSITION_METAL_BACKGROUND,
        /**
         * Represents the foreground for the Transition metals.
         */
        TRANSITION_METAL_FOREGROUND,
        /**
         * Represents the color of the collapse icon.
         */
        COLLAPSE_ICON_COLOR,
        /**
         * Represents the color of the collapse icon when mouse cursor enters the boundaries of the collapse icon.
         */
        COLLAPSE_ICON_HOVER_COLOR,
        /**
         * Represents the background for the tooltip.
         */
        TOOLTIP_BACKGROUND,
        /**
         * Represents the foreground for the tooltip.
         */
        TOOLTIP_FOREGROUND,
        /**
         * Represents the border color for the tooltip.
         */
        TOOLTIP_BORDER_COLOR,
        /**
         * Represents the corner radius of the tooltip border.
         */
        TOOLTIP_CORNER_RADIUS,
        /**
         * Represents the font for the tooltip.
         */
        TOOLTIP_FONT,
        /**
         * Represents the track color for both the vertical scroll bar and the horizontal scroll bar.
         */
        SCROLL_BAR_TRACK_COLOR,
        /**
         * Represents the thumb color for both the vertical scroll bar and the horizontal scroll bar.
         */
        SCROLL_BAR_THUMB_COLOR,
        /**
         * Represents the thumb color while dragging for both the vertical scroll bar and the horizontal scroll bar.
         */
        SCROLL_BAR_THUMB_DRAGGING_COLOR,
        /**
         * Represents the thumb corner radius for both the vertical scroll bar and the horizontal scroll bar.
         */
        SCROLL_BAR_THUMB_RADIUS,
        /**
         * Represents background color of the lower-right (or trailing) corner.
         */
        SCROLL_BAR_CORNER_COLOR,
        /**
         * Represents the height of the vertical knob.
         */
        SCROLL_BAR_VERTICAL_KNOB_HEIGHT,
        /**
         * Represents the width of the horizontal knob.
         */
        SCROLL_BAR_HORIZONTAL_KNOB_WIDTH
    }

    private final Preferences preferences;
    private final String SHOW_DETAILS = "show_details";
    private final String SELECTED_ELEMENT = "selected_element";
    private JPanel periodicTablePanel;
    private JPanel elementClassesPanel;
    private JPanel detailPanel;
    private Color backgroundColor = new Color(15, 15, 15);
    private Font font = new Font("Calibri", Font.BOLD, 16);
    private Color elementHoverBackground = Color.WHITE;
    private Color elementHoverForeground = new Color(0, 0, 0);
    private Color detailPanelBackground = new Color(25, 25, 25);
    private Color detailPanelForeground = Color.WHITE;
    private Color detailPanelHoverForeground = new Color(255, 255, 75);
    private Font detailPanelFont = font;
    private Color actinideBackground = new Color(97, 59, 40);
    private Color actinideForeground = Color.WHITE;
    private Color alkaliMetalBackground = new Color(129, 175, 150);
    private Color alkaliMetalForeground = Color.WHITE;
    private Color alkalineEarthMetalBackground = new Color(200, 150, 75);
    private Color alkalineEarthMetalForeground = Color.WHITE;
    private Color halogenBackground = new Color(125, 75, 175);
    private Color halogenForeground = Color.WHITE;
    private Color lanthanideBackground = new Color(155, 194, 230);
    private Color lanthanideForeground = Color.WHITE;
    private Color metalloidBackground = new Color(100, 110, 150);
    private Color metalloidForeground = Color.WHITE;
    private Color nobleGasBackground = new Color(100, 100, 100);
    private Color nobleGasForeground = Color.WHITE;
    private Color nonMetalBackground = new Color(48, 84, 150);
    private Color nonMetalForeground = Color.WHITE;
    private Color postTransitionMetalBackground = new Color(47, 77, 71);
    private Color postTransitionMetalForeground = Color.WHITE;
    private Color transitionMetalBackground = new Color(105, 125, 100);
    private Color transitionMetalForeground = Color.WHITE;
    private Color collapseIconColor = new Color(42, 54, 83);
    private Color collapseIconHoverColor = new Color(126, 162, 249);
    private Color tooltipBackground = new Color(30, 30, 30, 245);
    private Color tooltipForeground = Color.WHITE;
    private Color tooltipBorderColor = new Color(100, 100, 100, 255);
    private int tooltipCornerRadius = 10;
    private Font tooltipFont = new Font("SansSerif", Font.PLAIN, 13);
    private Color scrollBarTrackColor = new Color(25, 25, 25);
    private Color scrollBarThumbColor = new Color(35, 35, 35);
    private Color scrollBarThumbDragColor = new Color(45, 45, 45);
    private int scrollBarThumbRadius = 10;
    private Color scrollBarCornerColor = scrollBarThumbColor;
    private int scrollBarVerticalKnobHeight = 40;
    private int scrollBarHorizontalKnobWidth = 40;

    private JPanel elementDetailsPanel;
    private List<JLabel> detailLabels;
    private List<Tooltip> tooltips;
    private PeriodicScrollPane scrollPane;
    private JLabel infoLabel;
    private JLabel iconLabel;
    private JLabel headerLabel;
    private boolean isVisible;
    private int selectedElement;
    private Icon arrowLeft;
    private Icon arrowRight;
    private Tooltip iconTooltip;
    private String[] elementClasses;

    /**
     * Creates a Periodic Table with the provided language.
     *
     * @param locale the object that represents the language, default locale is {@code Locale.ENGLISH}
     *               if the provided parameter is {@code null}
     * @apiNote Currently only English ({@code Locale.ENGLISH}) and Turkish ({@code new Locale("tr")})
     * languages are supported.
     */
    public PeriodicTable(Locale locale) {
        super(new GridBagLayout());

        Dictionary.setLocale(locale == null ? Locale.ENGLISH : locale);
        preferences = Preferences.userNodeForPackage(PeriodicTable.class);

        init();
    }


    /**
     * Calculates the molecular weight according to the provided elements and their respective moles.
     *
     * @param elements the array of elements contained in the molecule, cannot be {@code null}
     * @param moles    the array of mole quantities for each element, cannot be {@code null}
     * @return the calculated molecular weight as a double
     * @throws NullPointerException     if {@code elements} or {@code moles} is {@code null}
     * @throws IllegalArgumentException if any of the following conditions are met:
     *                                  <ul>
     *                                    <li>the {@code elements} or {@code moles} array is empty</li>
     *                                    <li>the length of {@code elements} does not match the length of {@code moles}</li>
     *                                    <li>the {@code moles} array contains zero or negative values</li>
     *                                  </ul>
     */
    public double calculateMolecularWeight(Element[] elements, int[] moles) {
        Objects.requireNonNull(elements, "Elements array cannot be null.");
        Objects.requireNonNull(moles, "Moles array cannot be null.");
        if (elements.length == 0) throw new IllegalArgumentException("Elements array cannot be empty.");
        if (moles.length == 0) throw new IllegalArgumentException("Moles array cannot be empty.");
        if (elements.length != moles.length)
            throw new IllegalArgumentException("The number of elements must match the number of moles.");
        if (hasInvalidValues(moles))
            throw new IllegalArgumentException("Moles array must contain only positive values.");

        return java.util.stream.IntStream.range(0, elements.length)
                .mapToDouble(i -> elements[i].basicData().atomicMass() * moles[i])
                .sum();
    }

    /**
     * Customizes the provided attribute according to the provided value.
     *
     * @param attr  the attribute to be customized, cannot be {@code null}
     * @param value the new value for the attribute,; cannot be {@code null}
     * @throws NullPointerException     if {@code attr} or {@code value} is {@code null}
     * @throws IllegalArgumentException if the {@code value} represents a negative integer
     *                                  (e.g., radius, width, or height)
     * @throws ClassCastException       if the data type of the provided {@code value} is incorrect
     *                                  for the specified {@code attr}
     */
    public void setAttribute(CustomisationAttribute attr, Object value) {
        switch (Objects.requireNonNull(attr, "CustomisationAttribute cannot be null.")) {
            case BACKGROUND -> setBackgroundColor((Color) Objects.requireNonNull(value,
                                                                                 "Background cannot be null."));
            case ELEMENT_HOVER_BACKGROUND -> setElementHoverBackground((Color) Objects.requireNonNull(value,
                                                                                                      "HoverBackground cannot be null."));
            case ELEMENT_HOVER_FOREGROUND -> setElementHoverForeground((Color) Objects.requireNonNull(value,
                                                                                                      "HoverForeground cannot be null."));
            case FONT -> setTextFont((Font) Objects.requireNonNull(value, "Font cannot be null."));
            case DETAIL_PANEL_BACKGROUND -> setDetailPanelBackground((Color) Objects.requireNonNull(value,
                                                                                                    "DetailPanelBackground cannot be null."));
            case DETAIL_PANEL_FOREGROUND -> setDetailPanelForeground((Color) Objects.requireNonNull(value,
                                                                                                    "DetailPanelForeground cannot be null."));
            case DETAIL_PANEL_HOVER_FOREGROUND -> setDetailPanelHoverForeground((Color) Objects.requireNonNull(value,
                                                                                                               "DetailPanelHoverForeground cannot be null."));
            case DETAIL_PANEL_FONT -> setDetailPanelFont((Font) Objects.requireNonNull(value,
                                                                                       "Font cannot be null."));
            case ACTINIDE_BACKGROUND -> setActinideBackground((Color) Objects.requireNonNull(value,
                                                                                             "BackgroundColor cannot be null."));
            case ACTINIDE_FOREGROUND -> setActinideForeground((Color) Objects.requireNonNull(value,
                                                                                             "ForegroundColor cannot be null."));
            case ALKALI_METAL_BACKGROUND -> setAlkaliMetalBackground((Color) Objects.requireNonNull(value,
                                                                                                    "BackgroundColor cannot be null."));
            case ALKALI_METAL_FOREGROUND -> setAlkaliMetalForeground((Color) Objects.requireNonNull(value,
                                                                                                    "ForegroundColor cannot be null."));
            case ALKALINE_EARTH_METAL_BACKGROUND ->
                    setAlkalineEarthMetalBackground((Color) Objects.requireNonNull(value,
                                                                                   "BackgroundColor cannot be null."));
            case ALKALINE_EARTH_METAL_FOREGROUND ->
                    setAlkalineEarthMetalForeground((Color) Objects.requireNonNull(value,
                                                                                   "ForegroundColor cannot be null."));
            case HALOGEN_BACKGROUND -> setHalogenBackground((Color) Objects.requireNonNull(value,
                                                                                           "BackgroundColor cannot be null."));
            case HALOGEN_FOREGROUND -> setHalogenForeground((Color) Objects.requireNonNull(value,
                                                                                           "ForegroundColor cannot be null."));
            case LANTHANIDE_BACKGROUND -> setLanthanideBackground((Color) Objects.requireNonNull(value,
                                                                                                 "BackgroundColor cannot be null."));
            case LANTHANIDE_FOREGROUND -> setLanthanideForeground((Color) Objects.requireNonNull(value,
                                                                                                 "ForegroundColor cannot be null."));
            case METALLOID_BACKGROUND -> setMetalloidBackground((Color) Objects.requireNonNull(value,
                                                                                               "BackgroundColor cannot be null."));
            case METALLOID_FOREGROUND -> setMetalloidForeground((Color) Objects.requireNonNull(value,
                                                                                               "ForegroundColor cannot be null."));
            case NOBLE_GAS_BACKGROUND -> setNobleGasBackground((Color) Objects.requireNonNull(value,
                                                                                              "BackgroundColor cannot be null."));
            case NOBLE_GAS_FOREGROUND -> setNobleGasForeground((Color) Objects.requireNonNull(value,
                                                                                              "ForegroundColor cannot be null."));
            case NON_METAL_BACKGROUND -> setNonMetalBackground((Color) Objects.requireNonNull(value,
                                                                                              "BackgroundColor cannot be null."));
            case NON_METAL_FOREGROUND -> setNonMetalForeground((Color) Objects.requireNonNull(value,
                                                                                              "ForegroundColor cannot be null."));
            case POST_TRANSITION_METAL_BACKGROUND ->
                    setPostTransitionMetalBackground((Color) Objects.requireNonNull(value,
                                                                                    "BackgroundColor cannot be null."));
            case POST_TRANSITION_METAL_FOREGROUND ->
                    setPostTransitionMetalForeground((Color) Objects.requireNonNull(value,
                                                                                    "ForegroundColor cannot be null."));
            case TRANSITION_METAL_BACKGROUND -> setTransitionMetalBackground((Color) Objects.requireNonNull(value,
                                                                                                            "BackgroundColor cannot be null."));
            case TRANSITION_METAL_FOREGROUND -> setTransitionMetalForeground((Color) Objects.requireNonNull(value,
                                                                                                            "ForegroundColor cannot be null."));
            case COLLAPSE_ICON_COLOR -> setCollapseIconColor((Color) Objects.requireNonNull(value,
                                                                                            "CollapseIconColor cannot be null."));
            case COLLAPSE_ICON_HOVER_COLOR -> setCollapseIconHoverColor((Color) Objects.requireNonNull(value,
                                                                                                       "CollapseIconHoverColor cannot be null."));
            case TOOLTIP_BACKGROUND -> setTooltipBackground((Color) Objects.requireNonNull(value,
                                                                                           "TooltipBackgroundColor cannot be null."));
            case TOOLTIP_FOREGROUND ->
                    setTooltipForeground((Color) Objects.requireNonNull(value, "TooltipForegroundColor cannot be null."));
            case TOOLTIP_BORDER_COLOR -> setTooltipBorderColor((Color) Objects.requireNonNull(value,
                                                                                              "TooltipBorderColor cannot be null."));
            case TOOLTIP_CORNER_RADIUS -> setTooltipCornerRadius((int) value);
            case TOOLTIP_FONT -> setTooltipFont((Font) Objects.requireNonNull(value,
                                                                              "TooltipFont cannot be null."));
            case SCROLL_BAR_TRACK_COLOR -> setScrollBarTrackColor((Color) Objects.requireNonNull(value,
                                                                                                 "ScrollBarTrackColor cannot be null."));
            case SCROLL_BAR_THUMB_COLOR -> setScrollBarThumbColor((Color) Objects.requireNonNull(value,
                                                                                                 "ScrollBarThumbColor cannot be null."));
            case SCROLL_BAR_THUMB_DRAGGING_COLOR -> setScrollBarThumbDragColor((Color) Objects.requireNonNull(value,
                                                                                                              "ScrollBarThumbDragColor cannot be null."));
            case SCROLL_BAR_THUMB_RADIUS -> setScrollBarThumbRadius((int) value);
            case SCROLL_BAR_CORNER_COLOR -> setScrollBarCornerColor((Color) Objects.requireNonNull(value,
                                                                                                   "ScrollBarCornerColor cannot be null."));
            case SCROLL_BAR_VERTICAL_KNOB_HEIGHT -> setScrollBarVerticalKnobHeight((int) value);
            case SCROLL_BAR_HORIZONTAL_KNOB_WIDTH -> setScrollBarHorizontalKnobWidth((int) value);
        }
    }

    /**
     * Gets the background color of the periodic table.
     *
     * @return the background color
     */
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the background color of the periodic table.
     *
     * @param backgroundColor the new background color, cannot be {@code null}
     * @throws NullPointerException if the provided {@code backgroundColor} is {@code null}
     */
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = Objects.requireNonNull(backgroundColor, "BackgroundColor cannot be null.");
        setBackground(backgroundColor);
    }

    /**
     * Gets the font of the elements and element classes.
     *
     * @return the font of the elements and element classes
     */
    public Font getTextFont() {
        return font;
    }

    /**
     * Gets the font of the elements and element classes.
     *
     * @param textFont the new font for the elements and element classes, cannot be {@code null}
     * @throws NullPointerException if the provided {@code textFont} is {@code null}
     */
    public void setTextFont(Font textFont) {
        this.font = Objects.requireNonNull(textFont, "TextFont cannot be null.");

        updateElementClassFont(textFont);
        updateElementClassPanelFont(textFont);
    }

    /**
     * Gets the background color of the hover effect for the highlighted element of the periodic table.
     *
     * @return the background color of the hover effect
     */
    public Color getElementHoverBackground() {
        return elementHoverBackground;
    }

    /**
     * Sets the background color of the hover effect for the highlighted element of the periodic table.
     *
     * @param elementHoverBackground the new background color for the hover effect, cannot be {@code null}
     * @throws NullPointerException if the provided {@code elementHoverBackground} is {@code null}
     */
    public void setElementHoverBackground(Color elementHoverBackground) {
        this.elementHoverBackground = Objects.requireNonNull(elementHoverBackground,
                                                             "ElementHoverBackground cannot be null.");
    }

    /**
     * Gets the foreground color of the hover effect for the highlighted element of the periodic table.
     *
     * @return the foreground color of the hover effect
     */
    public Color getElementHoverForeground() {
        return elementHoverForeground;
    }

    /**
     * Sets the foreground color of the hover effect for the highlighted element of the periodic table.
     *
     * @param elementHoverForeground the new foreground color for the hover effect, cannot be null
     * @throws NullPointerException if the provided {@code elementHoverForeground} is {@code null}
     */
    public void setElementHoverForeground(Color elementHoverForeground) {
        this.elementHoverForeground = Objects.requireNonNull(elementHoverForeground,
                                                             "ElementHoverForeground cannot be null.");
    }

    /**
     * Gets the background color of the both the Actinide series elements and their corresponding display box.
     *
     * @return the background color for the Actinides
     */
    public Color getActinideBackground() {
        return actinideBackground;
    }

    /**
     * Sets the background color for both the Actinide series elements and their corresponding display box.
     *
     * @param actinideBackground the new background color for the Actinides, cannot be {@code null}
     * @throws NullPointerException if the provided {@code actinideBackground} is {@code null}
     */
    public void setActinideBackground(Color actinideBackground) {
        this.actinideBackground = Objects.requireNonNull(actinideBackground,
                                                         "ActinideBackground cannot be null.");
        updateElementClassBackground(0, actinideBackground);
    }

    /**
     * Gets the foreground color of the both the Actinide series elements and their corresponding display box.
     *
     * @return the foreground color for the Actinides
     */
    public Color getActinideForeground() {
        return actinideForeground;
    }

    /**
     * Sets the foreground color for both the Actinide series elements and their corresponding display box.
     *
     * @param actinideForeground the new foreground color for the Actinides, cannot be {@code null}
     * @throws NullPointerException if the provided {@code actinideForeground} is {@code null}
     */
    public void setActinideForeground(Color actinideForeground) {
        this.actinideForeground = Objects.requireNonNull(actinideForeground,
                                                         "ActinideForeground cannot be null.");
        updateElementClassForeground(0, actinideForeground);
    }

    /**
     * Gets the background color of the both the Alkali metal series elements and their corresponding display box.
     *
     * @return the background color for the Alkali metals
     */
    public Color getAlkaliMetalBackground() {
        return alkaliMetalBackground;
    }

    /**
     * Sets the background color for both the Alkali metal series elements and their corresponding display box.
     *
     * @param alkaliMetalBackground the new background color for the Alkali metals, cannot be {@code null}
     * @throws NullPointerException if the provided {@code alkaliMetalBackground} is {@code null}
     */
    public void setAlkaliMetalBackground(Color alkaliMetalBackground) {
        this.alkaliMetalBackground = Objects.requireNonNull(alkaliMetalBackground,
                                                            "AlkaliMetalBackground cannot be null.");
        updateElementClassBackground(1, alkaliMetalBackground);
    }

    /**
     * Gets the foreground color of the both the Alkali metal series elements and their corresponding display box.
     *
     * @return the foreground color for the Alkali metals
     */
    public Color getAlkaliMetalForeground() {
        return alkaliMetalForeground;
    }

    /**
     * Sets the foreground color for both the Alkali metal series elements and their corresponding display box.
     *
     * @param alkaliMetalForeground the new foreground color for the Alkali metals, cannot be {@code null}
     * @throws NullPointerException if the provided {@code alkaliMetalForeground} is {@code null}
     */
    public void setAlkaliMetalForeground(Color alkaliMetalForeground) {
        this.alkaliMetalForeground = Objects.requireNonNull(alkaliMetalForeground,
                                                            "AlkaliMetalForeground cannot be null.");
        updateElementClassForeground(1, alkaliMetalForeground);
    }

    /**
     * Gets the background color of the both the Alkaline earth metal series elements and their corresponding display box.
     *
     * @return the background color for the Alkaline earth metals
     */
    public Color getAlkalineEarthMetalBackground() {
        return alkalineEarthMetalBackground;
    }

    /**
     * Sets the background color for both the Alkaline earth metal series elements and their corresponding display box.
     *
     * @param alkalineEarthMetalBackground the new background color for the Alkaline earth metals, cannot be {@code null}
     * @throws NullPointerException if the provided {@code alkalineEarthMetalBackground} is {@code null}
     */
    public void setAlkalineEarthMetalBackground(Color alkalineEarthMetalBackground) {
        this.alkalineEarthMetalBackground = Objects.requireNonNull(alkalineEarthMetalBackground,
                                                                   "AlkalineEarthMetalBackground cannot be null.");
        updateElementClassBackground(2, alkalineEarthMetalBackground);
    }

    /**
     * Gets the foreground color of the both the Alkaline earth metal series elements and their corresponding display box.
     *
     * @return the foreground color for the Alkaline earth metals
     */
    public Color getAlkalineEarthMetalForeground() {
        return alkalineEarthMetalForeground;
    }

    /**
     * Sets the foreground color for both the Alkaline earth metal series elements and their corresponding display box.
     *
     * @param alkalineEarthMetalForeground the new foreground color for the Alkaline earth metals, cannot be {@code null}
     * @throws NullPointerException if the provided {@code alkalineEarthMetalForeground} is {@code null}
     */
    public void setAlkalineEarthMetalForeground(Color alkalineEarthMetalForeground) {
        this.alkalineEarthMetalForeground = Objects.requireNonNull(alkalineEarthMetalForeground,
                                                                   "AlkalineEarthMetalForeground cannot be null.");
        updateElementClassForeground(2, alkalineEarthMetalForeground);
    }

    /**
     * Gets the background color of the both the Halogen series elements and their corresponding display box.
     *
     * @return the background color for the Halogens
     */
    public Color getHalogenBackground() {
        return halogenBackground;
    }

    /**
     * Sets the background color for both the Halogen series elements and their corresponding display box.
     *
     * @param halogenBackground the new background color for the Halogens, cannot be {@code null}
     * @throws NullPointerException if the provided {@code halogenBackground} is {@code null}
     */
    public void setHalogenBackground(Color halogenBackground) {
        this.halogenBackground = Objects.requireNonNull(halogenBackground,
                                                        "HalogenBackground cannot be null.");
        updateElementClassBackground(3, halogenBackground);
    }

    /**
     * Gets the foreground color of the both the Halogen series elements and their corresponding display box.
     *
     * @return the foreground color for the Halogens
     */
    public Color getHalogenForeground() {
        return halogenForeground;
    }

    /**
     * Sets the foreground color for both the Halogen series elements and their corresponding display box.
     *
     * @param halogenForeground the new foreground color for the Halogens, cannot be {@code null}
     * @throws NullPointerException if the provided {@code halogenForeground} is {@code null}
     */
    public void setHalogenForeground(Color halogenForeground) {
        this.halogenForeground = Objects.requireNonNull(halogenForeground,
                                                        "HalogenForeground cannot be null.");
        updateElementClassForeground(3, halogenForeground);
    }

    /**
     * Gets the background color of the both the Lanthanide series elements and their corresponding display box.
     *
     * @return the background color for the Lanthanides
     */
    public Color getLanthanideBackground() {
        return lanthanideBackground;
    }

    /**
     * Sets the background color for both the Lanthanide series elements and their corresponding display box.
     *
     * @param lanthanideBackground the new background color for the Lanthanides, cannot be {@code null}
     * @throws NullPointerException if the provided {@code lanthanideBackground} is {@code null}
     */
    public void setLanthanideBackground(Color lanthanideBackground) {
        this.lanthanideBackground = Objects.requireNonNull(lanthanideBackground,
                                                           "LanthanideBackground cannot be null.");
        updateElementClassBackground(4, lanthanideBackground);
    }

    /**
     * Gets the foreground color of the both the Lanthanide series elements and their corresponding display box.
     *
     * @return the foreground color for the Lanthanides
     */
    public Color getLanthanideForeground() {
        return lanthanideForeground;
    }

    /**
     * Sets the foreground color for both the Lanthanide series elements and their corresponding display box.
     *
     * @param lanthanideForeground the new foreground color for the Lanthanides, cannot be {@code null}
     * @throws NullPointerException if the provided {@code lanthanideForeground} is {@code null}
     */
    public void setLanthanideForeground(Color lanthanideForeground) {
        this.lanthanideForeground = Objects.requireNonNull(lanthanideForeground,
                                                           "LanthanideForeground cannot be null.");
        updateElementClassForeground(4, lanthanideForeground);
    }

    /**
     * Gets the background color of the both the Metalloid series elements and their corresponding display box.
     *
     * @return the background color for the Metalloids
     */
    public Color getMetalloidBackground() {
        return metalloidBackground;
    }

    /**
     * Sets the background color for both the Metalloid series elements and their corresponding display box.
     *
     * @param metalloidBackground the new background color for the Metalloids, cannot be {@code null}
     * @throws NullPointerException if the provided {@code metalloidBackground} is {@code null}
     */
    public void setMetalloidBackground(Color metalloidBackground) {
        this.metalloidBackground = Objects.requireNonNull(metalloidBackground,
                                                          "MetalloidBackground cannot be null.");
        updateElementClassBackground(5, metalloidBackground);
    }

    /**
     * Gets the foreground color of the both the Metalloid series elements and their corresponding display box.
     *
     * @return the foreground color for the Metalloids
     */
    public Color getMetalloidForeground() {
        return metalloidForeground;
    }

    /**
     * Sets the foreground color for both the Metalloid series elements and their corresponding display box.
     *
     * @param metalloidForeground the new foreground color for the Metalloids, cannot be {@code null}
     * @throws NullPointerException if the provided {@code metalloidForeground} is {@code null}
     */
    public void setMetalloidForeground(Color metalloidForeground) {
        this.metalloidForeground = Objects.requireNonNull(metalloidForeground,
                                                          "MetalloidForeground cannot be null.");
        updateElementClassForeground(5, metalloidForeground);
    }

    /**
     * Gets the background color of the both the Noble gas series elements and their corresponding display box.
     *
     * @return the background color for the Noble gasses
     */
    public Color getNobleGasBackground() {
        return nobleGasBackground;
    }

    /**
     * Sets the background color for both the Noble gas series elements and their corresponding display box.
     *
     * @param nobleGasBackground the new background color for the Noble gases, cannot be {@code null}
     * @throws NullPointerException if the provided {@code nobleGasBackground} is {@code null}
     */
    public void setNobleGasBackground(Color nobleGasBackground) {
        this.nobleGasBackground = Objects.requireNonNull(nobleGasBackground,
                                                         "NobleGasBackground cannot be null.");
        updateElementClassBackground(6, nobleGasBackground);
    }

    /**
     * Gets the foreground color of the both the Noble gas series elements and their corresponding display box.
     *
     * @return the foreground color for the Noble gasses
     */
    public Color getNobleGasForeground() {
        return nobleGasForeground;
    }

    /**
     * Sets the foreground color for both the Noble gas series elements and their corresponding display box.
     *
     * @param nobleGasForeground the new foreground color for the Noble gases, cannot be {@code null}
     * @throws NullPointerException if the provided {@code nobleGasForeground} is {@code null}
     */
    public void setNobleGasForeground(Color nobleGasForeground) {
        this.nobleGasForeground = Objects.requireNonNull(nobleGasForeground,
                                                         "NobleGasForeground cannot be null.");
        updateElementClassForeground(6, nobleGasForeground);
    }

    /**
     * Gets the background color of the both the Non-metal series elements and their corresponding display box.
     *
     * @return the background color for the Non-metals
     */
    public Color getNonMetalBackground() {
        return nonMetalBackground;
    }

    /**
     * Sets the background color for both the Non-metal series elements and their corresponding display box.
     *
     * @param nonMetalBackground the new background color for the Non-metals, cannot be {@code null}
     * @throws NullPointerException if the provided {@code nonMetalBackground} is {@code null}
     */
    public void setNonMetalBackground(Color nonMetalBackground) {
        this.nonMetalBackground = Objects.requireNonNull(nonMetalBackground,
                                                         "NonMetalBackground cannot be null.");
        updateElementClassBackground(7, nonMetalBackground);
    }

    /**
     * Gets the foreground color of the both the Non-metal series elements and their corresponding display box.
     *
     * @return the foreground color for the Non-metals
     */
    public Color getNonMetalForeground() {
        return nonMetalForeground;
    }

    /**
     * Sets the foreground color for both the Non-metal series elements and their corresponding display box.
     *
     * @param nonMetalForeground the new foreground color for the Non-metals, cannot be {@code null}
     * @throws NullPointerException if the provided {@code nonMetalForeground} is {@code null}
     */
    public void setNonMetalForeground(Color nonMetalForeground) {
        this.nonMetalForeground = Objects.requireNonNull(nonMetalForeground,
                                                         "NonMetalForeground cannot be null.");
        updateElementClassForeground(7, nonMetalForeground);
    }

    /**
     * Gets the background color of the both the Post-transition metal series elements and their corresponding display box.
     *
     * @return the background color for the Post-transition metals
     */
    public Color getPostTransitionMetalBackground() {
        return postTransitionMetalBackground;
    }

    /**
     * Sets the background color for both the Post-transition metal series elements and their corresponding display box.
     *
     * @param postTransitionMetalBackground the new background color for the Post-transition metals, cannot be {@code null}
     * @throws NullPointerException if the provided {@code postTransitionMetalBackground} is {@code null}
     */
    public void setPostTransitionMetalBackground(Color postTransitionMetalBackground) {
        this.postTransitionMetalBackground = Objects.requireNonNull(postTransitionMetalBackground,
                                                                    "PostTransitionMetalBackground cannot be null.");
        updateElementClassBackground(8, postTransitionMetalBackground);
    }

    /**
     * Gets the foreground color of the both the Post-transition metal series elements and their corresponding display box.
     *
     * @return the foreground color for the Post-transition metals
     */
    public Color getPostTransitionMetalForeground() {
        return postTransitionMetalForeground;
    }

    /**
     * Sets the foreground color for both the Post-transition metal series elements and their corresponding display box.
     *
     * @param postTransitionMetalForeground the new foreground color for the Post-transition metals, cannot be {@code null}
     * @throws NullPointerException if the provided {@code postTransitionMetalForeground} is {@code null}
     */
    public void setPostTransitionMetalForeground(Color postTransitionMetalForeground) {
        this.postTransitionMetalForeground = Objects.requireNonNull(postTransitionMetalForeground,
                                                                    "PostTransitionMetalForeground cannot be null.");
        updateElementClassForeground(8, postTransitionMetalForeground);
    }

    /**
     * Gets the background color of the both the Transition metal series elements and their corresponding display box.
     *
     * @return the background color for the Transition metals
     */
    public Color getTransitionMetalBackground() {
        return transitionMetalBackground;
    }

    /**
     * Sets the background color for both the Transition metal series elements and their corresponding display box.
     *
     * @param transitionMetalBackground the new background color for the Transition metals, cannot be {@code null}
     * @throws NullPointerException if the provided {@code transitionMetalBackground} is {@code null}
     */
    public void setTransitionMetalBackground(Color transitionMetalBackground) {
        this.transitionMetalBackground = Objects.requireNonNull(transitionMetalBackground,
                                                                "TransitionMetalBackground cannot be null.");
        updateElementClassBackground(9, transitionMetalBackground);
    }

    /**
     * Gets the foreground color of the both the Transition metal series elements and their corresponding display box.
     *
     * @return the foreground color for the Transition metals
     */
    public Color getTransitionMetalForeground() {
        return transitionMetalForeground;
    }

    /**
     * Sets the foreground color for both the Transition metal series elements and their corresponding display box.
     *
     * @param transitionMetalForeground the new foreground color for the Transition metals, cannot be {@code null}
     * @throws NullPointerException if the provided {@code transitionMetalForeground} is {@code null}
     */
    public void setTransitionMetalForeground(Color transitionMetalForeground) {
        this.transitionMetalForeground = Objects.requireNonNull(transitionMetalForeground,
                                                                "TransitionMetalForeground cannot be null.");
        updateElementClassForeground(9, transitionMetalForeground);
    }

    /**
     * Gets the background color of the detail panel.
     *
     * @return the background color of the detail panel
     */
    public Color getDetailPanelBackground() {
        return detailPanelBackground;
    }

    /**
     * Sets the background color of the detail panel.
     *
     * @param detailPanelBackground the new background color for the detail panel, cannot be {@code null}
     * @throws NullPointerException if the provided {@code detailPanelBackground} is {@code null}
     */
    public void setDetailPanelBackground(Color detailPanelBackground) {
        this.detailPanelBackground = Objects.requireNonNull(detailPanelBackground,
                                                            "DetailPanelBackground cannot be null.");
        elementDetailsPanel.setBackground(detailPanelBackground);
    }

    /**
     * Gets the foreground color of the detail panel.
     *
     * @return the foreground color of the detail panel
     */
    public Color getDetailPanelForeground() {
        return detailPanelForeground;
    }

    /**
     * Sets the foreground color of the detail panel.
     *
     * @param detailPanelForeground the new foreground color for the detail panel, cannot be {@code null}
     * @throws NullPointerException if the provided {@code detailPanelForeground} is {@code null}
     */
    public void setDetailPanelForeground(Color detailPanelForeground) {
        this.detailPanelForeground = Objects.requireNonNull(detailPanelForeground,
                                                            "DetailPanelForeground cannot be null.");
        headerLabel.setForeground(detailPanelForeground);
        infoLabel.setForeground(detailPanelForeground);
        for (Component c : elementDetailsPanel.getComponents()) {
            c.setForeground(detailPanelForeground);
        }
    }

    /**
     * Gets the foreground color of the detail panel when detail text is clicked.
     *
     * @return the foreground color of the clicked text
     */
    public Color getDetailPanelHoverForeground() {
        return detailPanelHoverForeground;
    }

    /**
     * Sets the foreground color of the detail panel when detail text is clicked.
     *
     * @param detailPanelHoverForeground the new clicked foreground color for the detail panel, cannot be {@code null}
     * @throws NullPointerException if the provided {@code detailPanelHoverForeground} is {@code null}
     */
    public void setDetailPanelHoverForeground(Color detailPanelHoverForeground) {
        this.detailPanelHoverForeground = Objects.requireNonNull(detailPanelHoverForeground,
                                                                 "DetailPanelHoverForeground cannot be null.");
    }

    /**
     * Gets the font for the titles in the detail panel.
     *
     * @return the font of the detail panel
     */
    public Font getDetailPanelFont() {
        return detailPanelFont;
    }

    /**
     * Sets the font for the titles in the detail panel.
     *
     * @param detailPanelFont the new font for the detail panel, cannot be {@code null}
     * @throws NullPointerException if the provided {@code detailPanelFont} is {@code null}
     * @apiNote This font is applied to titles. For the details, the same font with a plain style is applied.
     */
    public void setDetailPanelFont(Font detailPanelFont) {
        this.detailPanelFont = Objects.requireNonNull(detailPanelFont, "DetailPanelFont cannot be null.");
        headerLabel.setFont(detailPanelFont);
        infoLabel.setFont(getDetailFont(detailPanelFont));

        for (int i = 0; i < elementDetailsPanel.getComponents().length; i++) {
            if (i % 2 == 0) {
                elementDetailsPanel.getComponent(i).setFont(detailPanelFont);
            } else {
                elementDetailsPanel.getComponent(i).setFont(getDetailFont(detailPanelFont));
            }
        }

        updateScrollPaneDimension();
        scrollPane.revalidate();
        scrollPane.repaint();
        revalidate();
        repaint();

    }

    /**
     * Gets the color of the collapse icon.
     *
     * @return the color of the collapse icon
     */
    public Color getCollapseIconColor() {
        return collapseIconColor;
    }

    /**
     * Sets the color of the collapse icon.
     *
     * @param collapseIconColor the new color for the collapse icon, cannot be {@code null}
     * @throws NullPointerException if the provided {@code collapseIconColor is {@code null}
     */
    public void setCollapseIconColor(Color collapseIconColor) {
        this.collapseIconColor = Objects.requireNonNull(collapseIconColor, "CollapseIconColor cannot be null.");
        arrowLeft = recolorIcon(arrowLeft, collapseIconColor);
        arrowRight = recolorIcon(arrowRight, collapseIconColor);
        iconLabel.setIcon(isVisible ? arrowLeft : arrowRight);
    }

    /**
     * Gets the hover color of the collapse icon when mouse cursor enters the boundaries of the collapse icon.
     *
     * @return the color for the hover effect of the collapse icon
     */
    public Color getCollapseIconHoverColor() {
        return collapseIconColor;
    }

    /**
     * Sets the hover color of the collapse icon when mouse cursor enters the boundaries of the collapse icon.
     *
     * @param collapseIconHoverColor the new color for the hover effect of the collapse icon, cannot be {@code null}
     * @throws NullPointerException if the provided {@code collapseIconHoverColor is {@code null}
     */
    public void setCollapseIconHoverColor(Color collapseIconHoverColor) {
        this.collapseIconHoverColor = Objects.requireNonNull(collapseIconHoverColor,
                                                             "CollapseIconHoverColor cannot be null.");
    }

    /**
     * Gets the background color of the tooltip.
     *
     * @return the background color of the tooltip
     */
    public Color getTooltipBackground() {
        return tooltipBackground;
    }

    /**
     * Sets the background color of the tooltip.
     *
     * @param tooltipBackground the new background color for the tooltip, cannot be {@code null}
     * @throws NullPointerException if the provided {@code tooltipBackground} is {@code null}
     */
    public void setTooltipBackground(Color tooltipBackground) {
        this.tooltipBackground = Objects.requireNonNull(tooltipBackground, "TooltipBackground cannot be null.");
    }

    /**
     * Gets the foreground color of the tooltip.
     *
     * @return the foreground color of the tooltip
     */
    public Color getTooltipForeground() {
        return tooltipForeground;
    }

    /**
     * Sets the foreground color of the tooltip.
     *
     * @param tooltipForeground the new foreground color for the tooltip, cannot be {@code null}
     * @throws NullPointerException if the provided {@code tooltipForeground} is {@code null}
     */
    public void setTooltipForeground(Color tooltipForeground) {
        this.tooltipForeground = Objects.requireNonNull(tooltipForeground, "TooltipForeground cannot be null.");
        iconTooltip.setTooltipForeground(tooltipForeground);
        for (Tooltip t : tooltips) {
            t.setTooltipForeground(tooltipForeground);
        }
    }

    /**
     * Gets the font of the tooltip.
     *
     * @return the font of the tooltip
     */
    public Font getTooltipFont() {
        return tooltipFont;
    }

    /**
     * Sets the font of the tooltip.
     *
     * @param tooltipFont the new font for the tooltip, cannot be {@code null}
     * @throws NullPointerException if the provided {@code tooltipFont} is {@code null}
     */
    public void setTooltipFont(Font tooltipFont) {
        this.tooltipFont = Objects.requireNonNull(tooltipFont, "TooltipFont cannot be null.");
        iconTooltip.setTooltipFont(tooltipFont);
        for (Tooltip t : tooltips) {
            t.setTooltipFont(tooltipFont);
        }
    }

    /**
     * Gets the color of the tooltip border.
     *
     * @return the border color of the tooltip
     */
    public Color getTooltipBorderColor() {
        return tooltipForeground;
    }

    /**
     * Sets the color of the tooltip border.
     *
     * @param tooltipBorderColor the new border color for the tooltip, cannot be {@code null}
     * @throws NullPointerException if the provided {@code tooltipBorderColor} is {@code null}
     */
    public void setTooltipBorderColor(Color tooltipBorderColor) {
        this.tooltipBorderColor = Objects.requireNonNull(tooltipBorderColor,
                                                         "TooltipBorderColor cannot be null.");
    }

    /**
     * Gets the radius of the tooltip corners.
     *
     * @return the corner radius of the tooltip
     */
    public int getTooltipCornerRadius() {
        return tooltipCornerRadius;
    }

    /**
     * Sets the radius of the tooltip corners.
     *
     * @param tooltipCornerRadius the new corner radius of the tooltip, cannot be negative
     * @throws IllegalArgumentException if the provided {@code tooltipCornerRadius} is negative
     */
    public void setTooltipCornerRadius(int tooltipCornerRadius) {
        if (tooltipCornerRadius < 0) throw new IllegalArgumentException("TooltipCornerRadius cannot be negative.");
        this.tooltipCornerRadius = tooltipCornerRadius;
    }

    /**
     * Gets the track color of the both vertical and horizontal scroll bars.
     *
     * @return the track color of the scroll bars
     */
    public Color getScrollBarTrackColor() {
        return scrollBarTrackColor;
    }

    /**
     * Sets the track color of the both vertical and horizontal scroll bars.
     *
     * @param scrollBarTrackColor the new track color for the scroll bars, cannot be {@code null}
     * @throws NullPointerException if the provided {@code scrollBarTrackColor} is {@code null}
     */
    public void setScrollBarTrackColor(Color scrollBarTrackColor) {
        this.scrollBarTrackColor = Objects.requireNonNull(scrollBarTrackColor,
                                                          "ScrollBarTrackColor cannot be null.");
    }

    /**
     * Gets the thumb color of the both vertical and horizontal scroll bars.
     *
     * @return the thumb color of the scroll bars
     */
    public Color getScrollBarThumbColor() {
        return scrollBarThumbColor;
    }

    /**
     * Sets the thumb color of the both vertical and horizontal scroll bars.
     *
     * @param scrollBarThumbColor the new thumb color for the scroll bars, cannot be {@code null}
     * @throws NullPointerException if the provided {@code scrollBarThumbColor} is {@code null}
     */
    public void setScrollBarThumbColor(Color scrollBarThumbColor) {
        this.scrollBarThumbColor = Objects.requireNonNull(scrollBarThumbColor,
                                                          "ScrollBarThumbColor cannot be null.");
    }

    /**
     * Gets the thumb color of the both vertical and horizontal scroll bars while dragging.
     *
     * @return the thumb drag color of the scroll bars
     */
    public Color getScrollBarThumbDragColor() {
        return scrollBarThumbDragColor;
    }

    /**
     * Sets the thumb color of the both vertical and horizontal scroll bars while dragging.
     *
     * @param scrollBarThumbDragColor the new thumb drag color for the scroll bars, cannot be {@code null}
     * @throws NullPointerException if the provided {@code scrollBarThumbDragColor} is {@code null}
     */
    public void setScrollBarThumbDragColor(Color scrollBarThumbDragColor) {
        this.scrollBarThumbDragColor = Objects.requireNonNull(scrollBarThumbDragColor,
                                                              "ScrollBarThumbDragColor cannot be null.");
    }

    /**
     * Gets the thumb corner radius of the both vertical and horizontal scroll bars.
     *
     * @return the corner radius of the thumb
     */
    public int getScrollBarThumbRadius() {
        return scrollBarThumbRadius;
    }

    /**
     * Sets the thumb corner radius of the both vertical and horizontal scroll bars.
     *
     * @param scrollBarThumbRadius the new corner radius for the thumb, cannot be {@code negative}
     * @throws NullPointerException if the provided {@code scrollBarThumbRadius} is {@code negative}
     */
    public void setScrollBarThumbRadius(int scrollBarThumbRadius) {
        if (scrollBarThumbRadius < 0) throw new IllegalArgumentException("ScrollBarThumbRadius cannot be negative.");
        this.scrollBarThumbRadius = scrollBarThumbRadius;
    }

    /**
     * Gets the background color of the lower-right (or trailing) corner
     * of the scroll pane.
     *
     * @return the corner  color of the scroll pane
     */
    public Color getScrollBarCornerColor() {
        return scrollBarCornerColor;
    }

    /**
     * Sets the background color of the lower-right (or trailing) corner
     * of the scroll pane.
     *
     * @param scrollBarCornerColor the new corner color of the scroll pane, cannot be {@code null}
     * @throws NullPointerException if the provided {@code cornerColor} is {@code null}
     */
    public void setScrollBarCornerColor(Color scrollBarCornerColor) {
        this.scrollBarCornerColor = Objects.requireNonNull(scrollBarCornerColor,
                                                           "ScrollBarCornerColor cannot be null.");
        scrollPane.setCornerColor(scrollBarCornerColor);
    }

    /**
     * Gets the height of the vertical knob.
     *
     * @return the height of the vertical knob
     */
    public int getScrollBarVerticalKnobHeight() {
        return scrollBarVerticalKnobHeight;
    }

    /**
     * Sets the height for the vertical knob.
     *
     * @param scrollBarVerticalKnobHeight the new height for the vertical knob, cannot be {@code negative}
     * @throws NullPointerException if the provided {@code scrollBarVerticalKnobHeight} is {@code negative}
     */
    public void setScrollBarVerticalKnobHeight(int scrollBarVerticalKnobHeight) {
        if (scrollBarVerticalKnobHeight < 0)
            throw new IllegalArgumentException("ScrollBarVerticalKnobHeight cannot be negative.");
        this.scrollBarVerticalKnobHeight = scrollBarVerticalKnobHeight;
        scrollPane.setVerticalKnobHeight(scrollBarVerticalKnobHeight);
    }

    /**
     * Gets the width of the horizontal knob.
     *
     * @return the width of the horizontal knob
     */
    public int getScrollBarHorizontalKnobWidth() {
        return scrollBarHorizontalKnobWidth;
    }

    /**
     * Sets the width for the horizontal knob.
     *
     * @param scrollBarHorizontalKnobWidth the new width for the horizontal knob, cannot be {@code negative}
     * @throws NullPointerException if the provided {@code scrollBarHorizontalKnobWidth} is {@code negative}
     */
    public void setScrollBarHorizontalKnobWidth(int scrollBarHorizontalKnobWidth) {
        if (scrollBarHorizontalKnobWidth < 0)
            throw new IllegalArgumentException("ScrollBarHorizontalKnobWidth cannot be negative.");
        this.scrollBarHorizontalKnobWidth = scrollBarHorizontalKnobWidth;
        scrollPane.setHorizontalKnobWidth(scrollBarHorizontalKnobWidth);
    }

    private boolean hasInvalidValues(int[] moles) {
        return Arrays.stream(moles).anyMatch(i -> i <= 0);
    }

    private void createPeriodicTablePanel() {
        periodicTablePanel = new JPanel(new GridBagLayout());
        periodicTablePanel.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;

        for (Elements e : Elements.values()) {
            Element element = e.get();
            gbc.gridx = element.basicData().groupNumber() - 1;
            gbc.gridy = element.basicData().periodNumber() - 1;

            JPanel elementPanel = createElementItem(element);

            periodicTablePanel.add(elementPanel, gbc);
        }
        Dimension dim = getMaxDimension(periodicTablePanel);
        updateElementPanel(periodicTablePanel, dim);
    }

    private void createElementClassesPanel() {
        elementClassesPanel = new JPanel(new GridBagLayout());
        elementClassesPanel.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTHWEST;

        gbc.gridy = 0;
        gbc.gridx = 0;

        for (String ec : elementClasses) {
            if (gbc.gridx == 5) {
                gbc.gridx = 0;
                gbc.gridy++;
            }
            JPanel infoPanel = createElementClassItem(ec);
            elementClassesPanel.add(infoPanel, gbc);
            gbc.gridx++;
        }
    }

    private void createIconLabel() {
        Icon icLeft = new ImageIcon(Objects.requireNonNull(PeriodicTable.class.getResource("/icons/arrow_left.png")));
        Icon icRight = new ImageIcon(Objects.requireNonNull(PeriodicTable.class.getResource("/icons/arrow_right.png")));
        arrowLeft = recolorIcon(icLeft, collapseIconColor);
        arrowRight = recolorIcon(icRight, collapseIconColor);
        iconLabel = new JLabel();
        iconLabel.setIcon(isVisible ? arrowLeft : arrowRight);

        String key = isVisible ? Keys.HIDE_DETAILS : Keys.SHOW_DETAILS;
        iconTooltip = new Tooltip(iconLabel, Dictionary.getText(key));
        iconTooltip.setTooltipAlignment(Tooltip.TooltipAlignment.BOTTOM_RIGHT_TO_LEFT);
    }

    private void createDetailPanel() {
        headerLabel = new JLabel(Dictionary.getText(Keys.ELEMENT_DETAILS));
        headerLabel.setForeground(detailPanelForeground);
        headerLabel.setFont(detailPanelFont);

        String infoText = Dictionary.getText(Keys.SELECT_ELEMENT_FOR_DETAILS);
        infoLabel = new JLabel(infoText);
        infoLabel.setForeground(detailPanelForeground);
        infoLabel.setFont(getDetailFont(detailPanelFont));

        detailPanel = new JPanel(new GridBagLayout());
        detailPanel.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 5, 5, 5);
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        detailPanel.add(headerLabel, gbc);

        gbc.insets.top = 5;
        gbc.weightx = 0;
        gbc.gridwidth = 0;
        gbc.gridy++;
        detailPanel.add(infoLabel, gbc);

        elementDetailsPanel = new JPanel(new GridBagLayout());
        elementDetailsPanel.setBackground(detailPanelBackground);

        scrollPane = new PeriodicScrollPane(elementDetailsPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                                            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        updateScrollPaneDimension();

        GridBagConstraints gbcDetails = new GridBagConstraints();
        gbcDetails.anchor = GridBagConstraints.NORTHWEST;
        gbcDetails.insets = new Insets(5, 5, 5, 5);
        gbcDetails.gridx = 0;
        gbcDetails.gridy = 0;

        for (int i = 0; i < titles().size(); i++) {
            gbcDetails.insets.top = i == 0 ? 15 : 5;
            gbcDetails.insets.left = 15;
            gbcDetails.insets.right = 5;
            gbcDetails.gridx = 0;
            String text = titles().get(i);
            JLabel titleLabel = new JLabel(text + ":");
            titleLabel.setFont(detailPanelFont);
            titleLabel.setForeground(detailPanelForeground);
            elementDetailsPanel.add(titleLabel, gbcDetails);

            gbcDetails.gridx = 1;
            gbc.insets.left = 5;
            gbcDetails.insets.right = 15;
            JLabel detailLabel = new JLabel();
            detailLabel.setFont(getDetailFont(detailPanelFont));
            detailLabel.setForeground(detailPanelForeground);
            elementDetailsPanel.add(detailLabel, gbcDetails);
            detailLabels.add(detailLabel);

            detailLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    if (e.getButton() == java.awt.event.MouseEvent.BUTTON1) {
                        try {
                            String copiedText = detailLabel.getText();
                            if (copiedText != null && copiedText.toLowerCase().contains("<html")) {
                                copiedText = convertHtmlTagsToUnicode(copiedText).replaceAll("<[^>]*>", "");
                            }

                            Toolkit
                                    .getDefaultToolkit()
                                    .getSystemClipboard()
                                    .setContents(new StringSelection(copiedText), null);
                            String msg = text + " " + Dictionary.getText(Keys.COPIED_TO_CLIPBOARD);
                            new PopupMessage(detailLabel, msg, 1000).showPopupMessage();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }

                }

                @Override
                public void mouseEntered(java.awt.event.MouseEvent e) {
                    detailLabel.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
                    detailLabel.setForeground(detailPanelHoverForeground);
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent e) {
                    detailLabel.setForeground(detailPanelForeground);
                }
            });

            gbcDetails.gridy++;
        }

        gbc.insets.bottom = 15;
        detailPanel.add(scrollPane, gbc);

        gbc.gridy = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        detailPanel.add(Box.createVerticalGlue(), gbc);

        infoLabel.setVisible(selectedElement == 0);
        scrollPane.setVisible(selectedElement > 0);

        if (selectedElement > 0)
            updateElementDetails(Elements.values()[selectedElement - 1].get());
    }

    private JPanel createElementItem(Element element) {
        Color elementBackground = getClassBackground(element.basicData().elementClass());
        Color elementForeground = getClassForeground(element.basicData().elementClass());
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(elementBackground);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 4, 2, 4);

        String text = createHtmlText(element);
        Tooltip tooltip = new Tooltip(panel, text);
        tooltip.attachTooltip();
        tooltips.add(tooltip);

        JLabel atomicNo = new JLabel(String.valueOf(element.basicData().atomicNumber()));
        JLabel symbol = new JLabel(element.basicData().symbol());
        atomicNo.setForeground(elementForeground);
        atomicNo.setFont(getNumberFont(font));
        symbol.setForeground(elementForeground);
        symbol.setFont(font);

        symbol.setHorizontalAlignment(SwingConstants.CENTER);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                infoLabel.setVisible(false);
                scrollPane.setVisible(true);
                updateElementDetails(element);
                preferences.putInt(SELECTED_ELEMENT, element.basicData().atomicNumber());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(elementHoverBackground);
                atomicNo.setForeground(elementHoverForeground);
                symbol.setForeground(elementHoverForeground);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(elementBackground);
                atomicNo.setForeground(elementForeground);
                symbol.setForeground(elementForeground);
            }
        });

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        gbc.anchor = GridBagConstraints.NORTHWEST;

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;

        panel.add(atomicNo, gbc);
        gbc.gridy = 1;
        gbc.insets.top = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets.left = 10;
        gbc.insets.right = 10;
        panel.add(symbol, gbc);

        return panel;
    }

    private JPanel createElementClassItem(String elementClass) {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(5, 5, 5, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        JPanel boxPanel = new JPanel();
        boxPanel.setBackground(getClassBackground(elementClass));
        boxPanel.setMinimumSize(new Dimension(15, 15));
        boxPanel.setPreferredSize(new Dimension(15, 15));
        boxPanel.setMaximumSize(new Dimension(15, 15));

        panel.add(boxPanel, gbc);

        gbc.gridx = 1;
        gbc.insets.right = 5;
        JLabel label = new JLabel(Dictionary.getText(elementClass));
        label.setFont(font);
        label.setForeground(getClassForeground(elementClass));
        panel.add(label, gbc);

        return panel;
    }

    private void init() {
        tooltips = new ArrayList<>();
        detailLabels = new ArrayList<>();
        elementClasses = new String[]{
                Keys.ElementProperties.ACTINIDE,
                Keys.ElementProperties.ALKALI_METAL,
                Keys.ElementProperties.ALKALINE_EARTH_METAL,
                Keys.ElementProperties.HALOGEN,
                Keys.ElementProperties.LANTHANIDE,
                Keys.ElementProperties.METALLOID,
                Keys.ElementProperties.NOBLE_GAS,
                Keys.ElementProperties.NON_METAL,
                Keys.ElementProperties.POST_TRANSITION_METAL,
                Keys.ElementProperties.TRANSITION_METAL
        };

        isVisible = preferences.getBoolean(SHOW_DETAILS, true);
        selectedElement = preferences.getInt(SELECTED_ELEMENT, 0);

        setupUI();
        setupListeners();
    }

    private void setupUI() {
        createIconLabel();
        createPeriodicTablePanel();
        createElementClassesPanel();
        createDetailPanel();

        setBackground(backgroundColor);

        int gap = 20;
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(gap, gap, 5, gap);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST;

        add(periodicTablePanel, gbc);
        gbc.gridy = 1;
        gbc.insets.bottom = 15;
        gbc.anchor = GridBagConstraints.NORTH;
        add(elementClassesPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets.bottom = 5;
        gbc.insets.left = 0;
        add(iconLabel, gbc);

        gbc.gridx = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTHWEST;

        add(detailPanel, gbc);
        detailPanel.setVisible(isVisible);
    }

    private void setupListeners() {
        iconLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible = !isVisible;
                detailPanel.setVisible(isVisible);
                String key = isVisible ? Keys.HIDE_DETAILS : Keys.SHOW_DETAILS;
                iconLabel.setIcon(isVisible ? arrowLeft : arrowRight);
                iconTooltip.setTooltipText(Dictionary.getText(key));
                preferences.putBoolean(SHOW_DETAILS, isVisible);

                Window window = SwingUtilities.getWindowAncestor(PeriodicTable.this);

                if (window != null) {
                    PeriodicTable.this.revalidate();
                    window.pack();
                    window.repaint();
                } else {
                    revalidate();
                    repaint();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Icon ic = isVisible ? arrowLeft : arrowRight;
                String key = isVisible ? Keys.HIDE_DETAILS : Keys.SHOW_DETAILS;

                iconLabel.setIcon(recolorIcon(ic, collapseIconHoverColor));
                iconTooltip.setTooltipText(Dictionary.getText(key));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                iconLabel.setIcon(isVisible ? arrowLeft : arrowRight);
                String key = isVisible ? Keys.HIDE_DETAILS : Keys.SHOW_DETAILS;
                iconTooltip.setTooltipText(Dictionary.getText(key));
            }
        });
    }

    private void updateScrollPaneDimension() {
        int height = periodicTablePanel.getPreferredSize().height + elementClassesPanel.getPreferredSize().height + 15;
        int width = infoLabel.getPreferredSize().width + 30;

        Dimension dim = new Dimension(width, height);
        scrollPane.setMinimumSize(dim);
        scrollPane.setPreferredSize(dim);
    }

    private Font getNumberFont(Font font) {
        return new Font(font.getFamily(), font.getStyle(), font.getSize() - 4);
    }

    private Font getDetailFont(Font font) {
        return new Font(font.getFamily(), Font.PLAIN, font.getSize());
    }

    private ImageIcon recolorIcon(Icon icon, Color color) {
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();

        BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        icon.paintIcon(null, g2, 0, 0);
        g2.dispose();

        for (int x = 0; x < w; x++) {
            for (int y = 0; y < h; y++) {
                int rgba = img.getRGB(x, y);
                int alpha = (rgba >> 24) & 0xff;

                if (alpha > 0) {
                    img.setRGB(x, y,
                               (alpha << 24) |
                                       (color.getRed() << 16) |
                                       (color.getGreen() << 8) |
                                       color.getBlue()
                    );
                }
            }
        }

        return new ImageIcon(img);
    }

    private static String convertHtmlTagsToUnicode(String input) {
        Pattern subPattern = Pattern.compile("<sub>(.*?)</sub>", Pattern.CASE_INSENSITIVE);
        Matcher subMatcher = subPattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        while (subMatcher.find()) {
            subMatcher.appendReplacement(sb, Matcher.quoteReplacement(convertToSubscript(subMatcher.group(1))));
        }
        subMatcher.appendTail(sb);

        Pattern supPattern = Pattern.compile("<sup>(.*?)</sup>", Pattern.CASE_INSENSITIVE);
        Matcher supMatcher = supPattern.matcher(sb.toString());
        StringBuilder finalSb = new StringBuilder();
        while (supMatcher.find()) {
            supMatcher.appendReplacement(finalSb, Matcher.quoteReplacement(convertToSuperscript(supMatcher.group(1))));
        }
        supMatcher.appendTail(finalSb);

        return finalSb.toString();
    }

    private static String convertToSubscript(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            switch (c) {
                case '0' -> result.append("₀");
                case '1' -> result.append("₁");
                case '2' -> result.append("₂");
                case '3' -> result.append("₃");
                case '4' -> result.append("₄");
                case '5' -> result.append("₅");
                case '6' -> result.append("₆");
                case '7' -> result.append("₇");
                case '8' -> result.append("₈");
                case '9' -> result.append("₉");
                case '+' -> result.append("₊");
                case '-' -> result.append("₋");
                default -> result.append(c);
            }
        }
        return result.toString();
    }

    private static String convertToSuperscript(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            switch (c) {
                case '0' -> result.append("⁰");
                case '1' -> result.append("¹");
                case '2' -> result.append("²");
                case '3' -> result.append("³");
                case '4' -> result.append("⁴");
                case '5' -> result.append("⁵");
                case '6' -> result.append("⁶");
                case '7' -> result.append("⁷");
                case '8' -> result.append("⁸");
                case '9' -> result.append("⁹");
                case '+' -> result.append("⁺");
                case '-' -> result.append("⁻");
                case 'n' -> result.append("ⁿ");
                case 'x' -> result.append("ˣ");
                default -> result.append(c);
            }
        }
        return result.toString();
    }

    private void updateElementDetails(Element element) {
        List<String> details = elementDetails(element);

        for (int i = 0; i < detailLabels.size(); i++) {
            JLabel label = detailLabels.get(i);
            label.setText(details.get(i));
        }
    }

    private List<String> titles() {
        List<String> list = new ArrayList<>();

        list.add(Dictionary.getText(Keys.ElementProperties.NAME));
        list.add(Dictionary.getText(Keys.ElementProperties.SYMBOL));
        list.add(Dictionary.getText(Keys.ElementProperties.ATOMIC_NUMBER));
        list.add(Dictionary.getText(Keys.ElementProperties.ATOMIC_MASS));
        list.add(Dictionary.getText(Keys.ElementProperties.ELEMENT_CLASSIFICATION));
        list.add(Dictionary.getText(Keys.ElementProperties.NATURAL_OCCURRENCE));
        list.add(Dictionary.getText(Keys.ElementProperties.STANDARD_STATE));
        list.add(Dictionary.getText(Keys.ElementProperties.OXIDATION_STATES));
        list.add(Dictionary.getText(Keys.ElementProperties.PERIOD_NUMBER));
        list.add(Dictionary.getText(Keys.ElementProperties.GROUP_NUMBER));
        list.add(Dictionary.getText(Keys.ElementProperties.BLOCK));
        list.add(Dictionary.getText(Keys.ElementProperties.ELECTRON_CONFIGURATION));
        list.add(Dictionary.getText(Keys.ElementProperties.VAN_DER_WAALS_RADIUS));
        list.add(Dictionary.getText(Keys.ElementProperties.ELECTRONEGATIVITY));
        list.add(Dictionary.getText(Keys.ElementProperties.ELECTRON_AFFINITY));
        list.add(Dictionary.getText(Keys.ElementProperties.IONIZATION_ENERGY));
        list.add(Dictionary.getText(Keys.ElementProperties.MELTING_POINT));
        list.add(Dictionary.getText(Keys.ElementProperties.BOILING_POINT));
        list.add(Dictionary.getText(Keys.ElementProperties.MOLAR_HEAT_CAPACITY));
        list.add(Dictionary.getText(Keys.ElementProperties.SPECIFIC_HEAT_CAPACITY));
        list.add(Dictionary.getText(Keys.ElementProperties.DENSITY));
        list.add(Dictionary.getText(Keys.ElementProperties.CAS_NO));
        list.add(Dictionary.getText(Keys.ElementProperties.YEAR_DISCOVERED));
        list.add(Dictionary.getText(Keys.ElementProperties.PUBCHEM_URL));
        list.add(Dictionary.getText(Keys.ElementProperties.WIKIPEDIA_URL));

        return list;
    }

    private List<String> elementDetails(Element element) {
        BasicData basic = element.basicData();
        ChemicalData chemical = element.chemicalData();
        PhysicalData physical = element.physicalData();
        Metadata meta = element.metaData();

        int year = meta.yearDiscovered();

        List<String> list = new ArrayList<>();
        list.add(Dictionary.getText(basic.name()));
        list.add(basic.symbol());
        list.add(String.valueOf(basic.atomicNumber()));
        list.add(basic.atomicMass() + " u");
        list.add(Dictionary.getText(basic.elementClass()));
        list.add(Dictionary.getText(chemical.naturalOccurrence()));
        list.add(Dictionary.getText(chemical.standardState()));
        list.add(chemical.oxidationStates().toString());
        list.add(String.valueOf(chemical.period()));
        list.add(String.valueOf(basic.groupNumber()));
        list.add(chemical.block());
        list.add(chemical.electronConfiguration());
        list.add(basic.vanDerWaalsRadius() == null ? "-" : basic.vanDerWaalsRadius() + " pm");
        list.add(chemical.electronegativity() == null ? "-" : chemical.electronegativity() + " (Pauling Scale)");
        list.add(chemical.electronAffinity() == null ? "-" : chemical.electronAffinity() + " eV");
        list.add(chemical.ionizationEnergy() == null ? "-" : chemical.ionizationEnergy() + " eV");
        list.add(physical.meltingPoint() == null ? "-" : physical.meltingPoint() + " K");
        list.add(physical.boilingPoint() == null ? "-" : physical.boilingPoint() + " K");
        list.add(physical.molarHeatCapacity() == null ? "-" : physical.molarHeatCapacity() + " J/(mol·K)");
        list.add(physical.specificHeatCapacity() == null ? "-" : physical.specificHeatCapacity() + " J/(kg·K)");
        list.add(physical.density() == null ? "-" : "<html>" + physical.density() + " g/cm<small><sup>3</sup></small></html>");
        list.add(meta.casNo());
        list.add(year == 0 ? Dictionary.getText(Keys.ElementProperties.ANCIENT) : String.valueOf(year));
        list.add(meta.pubChemURL());
        list.add(meta.wikipediaURL());

        return list;
    }

    private Color getClassBackground(String elementClass) {
        return switch (elementClass) {
            case Keys.ElementProperties.ACTINIDE -> actinideBackground;
            case Keys.ElementProperties.ALKALI_METAL -> alkaliMetalBackground;
            case Keys.ElementProperties.ALKALINE_EARTH_METAL -> alkalineEarthMetalBackground;
            case Keys.ElementProperties.HALOGEN -> halogenBackground;
            case Keys.ElementProperties.LANTHANIDE -> lanthanideBackground;
            case Keys.ElementProperties.METALLOID -> metalloidBackground;
            case Keys.ElementProperties.NOBLE_GAS -> nobleGasBackground;
            case Keys.ElementProperties.NON_METAL -> nonMetalBackground;
            case Keys.ElementProperties.POST_TRANSITION_METAL -> postTransitionMetalBackground;
            case Keys.ElementProperties.TRANSITION_METAL -> transitionMetalBackground;
            default -> throw new IllegalArgumentException();
        };
    }

    private Color getClassForeground(String elementClass) {
        return switch (elementClass) {
            case Keys.ElementProperties.ACTINIDE -> actinideForeground;
            case Keys.ElementProperties.ALKALI_METAL -> alkaliMetalForeground;
            case Keys.ElementProperties.ALKALINE_EARTH_METAL -> alkalineEarthMetalForeground;
            case Keys.ElementProperties.HALOGEN -> halogenForeground;
            case Keys.ElementProperties.LANTHANIDE -> lanthanideForeground;
            case Keys.ElementProperties.METALLOID -> metalloidForeground;
            case Keys.ElementProperties.NOBLE_GAS -> nobleGasForeground;
            case Keys.ElementProperties.NON_METAL -> nonMetalForeground;
            case Keys.ElementProperties.POST_TRANSITION_METAL -> postTransitionMetalForeground;
            case Keys.ElementProperties.TRANSITION_METAL -> transitionMetalForeground;
            default -> throw new IllegalArgumentException();
        };
    }

    private void updateElementPanel(JPanel panel, Dimension dim) {
        for (Component c : panel.getComponents()) {
            c.setMinimumSize(dim);
            c.setPreferredSize(dim);
            c.setMaximumSize(dim);
        }
    }

    private Dimension getMaxDimension(JPanel panel) {
        int width = 0;
        int height = 0;

        for (Component c : panel.getComponents()) {
            Dimension dim = c.getPreferredSize();
            width = Math.max(width, dim.width);
            height = Math.max(height, dim.height);
        }

        return new Dimension(width, height);
    }

    private String createHtmlText(Element element) {
        return "<html><b>" + Dictionary.getText(element.basicData().name()) + "</b><br>" +
                "<b>" + Dictionary.getText(Keys.ElementProperties.ATOMIC_MASS) + ":</b> " + element.basicData().atomicMass() + " <i>u</i><br>" +
                "(" + Dictionary.getText(element.basicData().elementClass()) + ")<br><br>" +
                "<i>" + Dictionary.getText(Keys.CLICK_FOR_DETAILS) + "</i>" +
                "</html>";
    }

    private void updateElementClassPanelFont(Font font) {
        for (Component c : elementClassesPanel.getComponents()) {
            if (c instanceof JPanel) {
                ((JPanel) c).getComponent(1).setFont(font);
            }
        }
    }

    private void updateElementClassFont(Font font) {
        for (Component c : periodicTablePanel.getComponents()) {
            if (c instanceof JPanel) {
                ((JPanel) c).getComponent(0).setFont(getNumberFont(font));
                ((JPanel) c).getComponent(1).setFont(font);
            }
        }
    }

    private void updateElementClassForeground(int position, Color foregroundColor) {
        for (Elements e : Elements.values()) {
            Element element = e.get();
            if (element.basicData().elementClass().equals(elementClasses[position])) {
                JPanel panel = (JPanel) periodicTablePanel.getComponent(element.basicData().atomicNumber() - 1);
                JLabel numberLabel = (JLabel) panel.getComponent(0);
                JLabel elementLabel = (JLabel) panel.getComponent(1);

                numberLabel.setForeground(foregroundColor);
                elementLabel.setForeground(foregroundColor);
                panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseExited(MouseEvent e) {
                        numberLabel.setForeground(foregroundColor);
                        elementLabel.setForeground(foregroundColor);
                    }
                });
            }
        }

        JPanel panel = (JPanel) elementClassesPanel.getComponent(position);
        panel.getComponent(1).setForeground(foregroundColor);
    }

    private void updateElementClassBackground(int position, Color backgroundColor) {
        for (Elements e : Elements.values()) {
            Element element = e.get();
            if (element.basicData().elementClass().equals(elementClasses[position])) {
                JPanel panel = (JPanel) periodicTablePanel.getComponent(element.basicData().atomicNumber() - 1);
                panel.setBackground(backgroundColor);
                panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseExited(MouseEvent e) {
                        panel.setBackground(backgroundColor);
                    }
                });
            }
        }

        JPanel panel = (JPanel) elementClassesPanel.getComponent(position);
        panel.getComponent(0).setBackground(backgroundColor);
    }

    private class Tooltip extends JWindow {

        private JLabel label;
        private JPanel panel;
        private final JComponent component;
        private String text;
        private TooltipAlignment alignment = TooltipAlignment.BOTTOM_CENTER_TO_CENTER;

        public enum TooltipAlignment {
            TOP_LEFT_TO_LEFT, TOP_LEFT_TO_CENTER, TOP_LEFT_TO_RIGHT,
            TOP_CENTER_TO_LEFT, TOP_CENTER_TO_CENTER, TOP_CENTER_TO_RIGHT,
            TOP_RIGHT_TO_LEFT, TOP_RIGHT_TO_CENTER, TOP_RIGHT_TO_RIGHT,
            CENTER_LEFT_TO_LEFT, CENTER_LEFT_TO_CENTER, CENTER_LEFT_TO_RIGHT,
            CENTER_CENTER_TO_LEFT, CENTER_CENTER_TO_CENTER, CENTER_CENTER_TO_RIGHT,
            CENTER_RIGHT_TO_LEFT, CENTER_RIGHT_TO_CENTER, CENTER_RIGHT_TO_RIGHT,
            BOTTOM_LEFT_TO_LEFT, BOTTOM_LEFT_TO_CENTER, BOTTOM_LEFT_TO_RIGHT,
            BOTTOM_CENTER_TO_LEFT, BOTTOM_CENTER_TO_CENTER, BOTTOM_CENTER_TO_RIGHT,
            BOTTOM_RIGHT_TO_LEFT, BOTTOM_RIGHT_TO_CENTER, BOTTOM_RIGHT_TO_RIGHT
        }

        public Tooltip(JComponent component, String text) {
            this.component = Objects.requireNonNull(component, "Component cannot be null.");
            this.text = Objects.requireNonNull(text, "Text cannot be null.");

            init();
        }

        public void attachTooltip() {
            component.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    pack();

                    SwingUtilities.invokeLater(() -> {
                        Point point = getPoint(alignment);
                        setLocation(point.x, point.y);
                        setVisible(true);
                        toFront();
                    });
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    SwingUtilities.invokeLater(() -> setVisible(false));
                }
            });
        }

        public TooltipAlignment getPTooltipAlignment() {
            return alignment;
        }

        public void setTooltipAlignment(TooltipAlignment alignment) {
            this.alignment = Objects.requireNonNull(alignment, "Alignment cannot be null.");
            updateTooltipForVisibility();
        }

        public String getTooltipText() {
            return text;
        }

        public void setTooltipText(String text) {
            this.text = Objects.requireNonNull(text, "Text cannot be null");
            label.setText(text);
            updateTooltipForVisibility();
        }

        private void createViews() {
            panel = new JPanel(new BorderLayout()) {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                    int radius = tooltipCornerRadius;
                    g2d.setColor(tooltipBackground);
                    g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

                    g2d.setColor(tooltipBorderColor);
                    g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

                    g2d.dispose();
                }
            };
            panel.setOpaque(false);

            label = new JLabel(text);
            label.setForeground(tooltipForeground);
            label.setFont(tooltipFont);
            label.setVerticalTextPosition(SwingConstants.CENTER);

            int topPadding = 6;
            int leftPadding = 12;
            int bottomPadding = 6;
            int rightPadding = 12;
            label.setBorder(BorderFactory.createEmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        }

        private void init() {
            createViews();

            panel.add(label, BorderLayout.CENTER);

            setBackground(new Color(0, 0, 0, 0));

            setAlwaysOnTop(true);
            setFocusableWindowState(false);
            add(panel);
            pack();

            attachTooltip();
        }

        private Point getPoint(TooltipAlignment alignment) {
            Point componentPoint = component.getLocationOnScreen();

            int yAbove = componentPoint.y - getHeight();
            int yCenter = componentPoint.y + (component.getHeight() / 2) - (getHeight() / 2);
            int yBelow = componentPoint.y + component.getHeight();

            int xLeftToLeft = componentPoint.x;
            int xLeftToCenter = xLeftToLeft - (getWidth() / 2);
            int xLeftToRight = xLeftToLeft - getWidth();

            int xCenterToLeft = componentPoint.x + (component.getWidth() / 2);
            int xCenterToCenter = xCenterToLeft - (getWidth() / 2);
            int xCenterToRight = xCenterToLeft - getWidth();

            int xRightToLeft = componentPoint.x + component.getWidth();
            int xRightToCenter = xRightToLeft - (getWidth() / 2);
            int xRightToRight = xRightToLeft - getWidth();
            return switch (alignment) {
                case TOP_LEFT_TO_LEFT -> new Point(xLeftToLeft, yAbove);
                case TOP_LEFT_TO_CENTER -> new Point(xLeftToCenter, yAbove);
                case TOP_LEFT_TO_RIGHT -> new Point(xLeftToRight, yAbove);
                case TOP_CENTER_TO_LEFT -> new Point(xCenterToLeft, yAbove);
                case TOP_CENTER_TO_CENTER -> new Point(xCenterToCenter, yAbove);
                case TOP_CENTER_TO_RIGHT -> new Point(xCenterToRight, yAbove);
                case TOP_RIGHT_TO_LEFT -> new Point(xRightToLeft, yAbove);
                case TOP_RIGHT_TO_CENTER -> new Point(xRightToCenter, yAbove);
                case TOP_RIGHT_TO_RIGHT -> new Point(xRightToRight, yAbove);

                case CENTER_LEFT_TO_LEFT -> new Point(xLeftToLeft, yCenter);
                case CENTER_LEFT_TO_CENTER -> new Point(xLeftToCenter, yCenter);
                case CENTER_LEFT_TO_RIGHT -> new Point(xLeftToRight, yCenter);
                case CENTER_CENTER_TO_LEFT -> new Point(xCenterToLeft, yCenter);
                case CENTER_CENTER_TO_CENTER -> new Point(xCenterToCenter, yCenter);
                case CENTER_CENTER_TO_RIGHT -> new Point(xCenterToRight, yCenter);
                case CENTER_RIGHT_TO_LEFT -> new Point(xRightToLeft, yCenter);
                case CENTER_RIGHT_TO_CENTER -> new Point(xRightToCenter, yCenter);
                case CENTER_RIGHT_TO_RIGHT -> new Point(xRightToRight, yCenter);

                case BOTTOM_LEFT_TO_LEFT -> new Point(xLeftToLeft, yBelow);
                case BOTTOM_LEFT_TO_CENTER -> new Point(xLeftToCenter, yBelow);
                case BOTTOM_LEFT_TO_RIGHT -> new Point(xLeftToRight, yBelow);
                case BOTTOM_CENTER_TO_LEFT -> new Point(xCenterToLeft, yBelow);
                case BOTTOM_CENTER_TO_CENTER -> new Point(xCenterToCenter, yBelow);
                case BOTTOM_CENTER_TO_RIGHT -> new Point(xCenterToRight, yBelow);
                case BOTTOM_RIGHT_TO_LEFT -> new Point(xRightToLeft, yBelow);
                case BOTTOM_RIGHT_TO_CENTER -> new Point(xRightToCenter, yBelow);
                case BOTTOM_RIGHT_TO_RIGHT -> new Point(xRightToRight, yBelow);
            };
        }

        private void setTooltipForeground(Color foreground) {
            label.setForeground(foreground);
        }

        private void setTooltipFont(Font font) {
            label.setFont(font);
            panel.revalidate();
            panel.repaint();
        }

        private void updateTooltipForVisibility() {
            if (isVisible()) {
                pack();
                Point point = getPoint(alignment);
                setLocation(point.x, point.y);
            }
        }
    }

    private class PopupMessage extends JWindow {

        public enum PopupAlignment {
            TOP_LEFT_TO_LEFT, TOP_LEFT_TO_CENTER, TOP_LEFT_TO_RIGHT,
            TOP_CENTER_TO_LEFT, TOP_CENTER_TO_CENTER, TOP_CENTER_TO_RIGHT,
            TOP_RIGHT_TO_LEFT, TOP_RIGHT_TO_CENTER, TOP_RIGHT_TO_RIGHT,
            CENTER_LEFT_TO_LEFT, CENTER_LEFT_TO_CENTER, CENTER_LEFT_TO_RIGHT,
            CENTER_CENTER_TO_LEFT, CENTER_CENTER_TO_CENTER, CENTER_CENTER_TO_RIGHT,
            CENTER_RIGHT_TO_LEFT, CENTER_RIGHT_TO_CENTER, CENTER_RIGHT_TO_RIGHT,
            BOTTOM_LEFT_TO_LEFT, BOTTOM_LEFT_TO_CENTER, BOTTOM_LEFT_TO_RIGHT,
            BOTTOM_CENTER_TO_LEFT, BOTTOM_CENTER_TO_CENTER, BOTTOM_CENTER_TO_RIGHT,
            BOTTOM_RIGHT_TO_LEFT, BOTTOM_RIGHT_TO_CENTER, BOTTOM_RIGHT_TO_RIGHT
        }

        private final String message;
        private JPanel panel;
        private final int duration;
        private final JComponent component;
        private PopupAlignment alignment = PopupAlignment.BOTTOM_CENTER_TO_LEFT;

        public PopupMessage(JComponent component, String message, int duration) {
            this.component = Objects.requireNonNull(component, "Component cannot be null.");
            this.message = Objects.requireNonNull(message, "Message cannot be null");
            if (duration < 500)
                throw new IllegalArgumentException("Duration cannot be lower than 500 milliseconds (0.5 second)");
            this.duration = duration;

            createViews();
            setFocusableWindowState(false);
            setType(Type.POPUP);
            setBackground(new Color(0, 0, 0, 0));
            add(panel);
        }

        public void showPopupMessage() {
            pack();

            Point point = getPoint(alignment);
            setLocation(point.x, point.y);
            setVisible(true);
            toFront();

            Timer timer = new Timer(duration, e -> {
                setVisible(false);
                dispose();
            });
            timer.setRepeats(false);
            timer.start();
        }

        public PopupAlignment getPopupAlignment() {
            return alignment;
        }

        public void setPopupAlignment(PopupAlignment alignment) {
            this.alignment = Objects.requireNonNull(alignment);
            updatePopupForVisibility();
        }

        private void createViews() {
            panel = new JPanel(new BorderLayout()) {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                    int radius = tooltipCornerRadius;

                    g2d.setColor(tooltipBackground);
                    g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

                    g2d.setColor(tooltipBorderColor);
                    g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

                    g2d.dispose();
                }
            };
            panel.setOpaque(false);

            JLabel label = new JLabel(message);
            label.setForeground(tooltipForeground);
            label.setFont(tooltipFont);
            label.setVerticalTextPosition(SwingConstants.CENTER);
            int rightPadding = 12;
            int bottomPadding = 6;
            int leftPadding = 12;
            int topPadding = 6;
            label.setBorder(BorderFactory.createEmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));

            panel.add(label, BorderLayout.CENTER);
        }

        private Point getPoint(PopupAlignment alignment) {
            Point componentPoint = component.getLocationOnScreen();

            int yAbove = componentPoint.y - getHeight();
            int yCenter = componentPoint.y + (component.getHeight() / 2) - (getHeight() / 2);
            int yBelow = componentPoint.y + component.getHeight();

            int xLeftToLeft = componentPoint.x;
            int xLeftToCenter = xLeftToLeft - (getWidth() / 2);
            int xLeftToRight = xLeftToLeft - getWidth();

            int xCenterToLeft = componentPoint.x + (component.getWidth() / 2);
            int xCenterToCenter = xCenterToLeft - (getWidth() / 2);
            int xCenterToRight = xCenterToLeft - getWidth();

            int xRightToLeft = componentPoint.x + component.getWidth();
            int xRightToCenter = xRightToLeft - (getWidth() / 2);
            int xRightToRight = xRightToLeft - getWidth();
            return switch (alignment) {
                case TOP_LEFT_TO_LEFT -> new Point(xLeftToLeft, yAbove);
                case TOP_LEFT_TO_CENTER -> new Point(xLeftToCenter, yAbove);
                case TOP_LEFT_TO_RIGHT -> new Point(xLeftToRight, yAbove);
                case TOP_CENTER_TO_LEFT -> new Point(xCenterToLeft, yAbove);
                case TOP_CENTER_TO_CENTER -> new Point(xCenterToCenter, yAbove);
                case TOP_CENTER_TO_RIGHT -> new Point(xCenterToRight, yAbove);
                case TOP_RIGHT_TO_LEFT -> new Point(xRightToLeft, yAbove);
                case TOP_RIGHT_TO_CENTER -> new Point(xRightToCenter, yAbove);
                case TOP_RIGHT_TO_RIGHT -> new Point(xRightToRight, yAbove);

                case CENTER_LEFT_TO_LEFT -> new Point(xLeftToLeft, yCenter);
                case CENTER_LEFT_TO_CENTER -> new Point(xLeftToCenter, yCenter);
                case CENTER_LEFT_TO_RIGHT -> new Point(xLeftToRight, yCenter);
                case CENTER_CENTER_TO_LEFT -> new Point(xCenterToLeft, yCenter);
                case CENTER_CENTER_TO_CENTER -> new Point(xCenterToCenter, yCenter);
                case CENTER_CENTER_TO_RIGHT -> new Point(xCenterToRight, yCenter);
                case CENTER_RIGHT_TO_LEFT -> new Point(xRightToLeft, yCenter);
                case CENTER_RIGHT_TO_CENTER -> new Point(xRightToCenter, yCenter);
                case CENTER_RIGHT_TO_RIGHT -> new Point(xRightToRight, yCenter);

                case BOTTOM_LEFT_TO_LEFT -> new Point(xLeftToLeft, yBelow);
                case BOTTOM_LEFT_TO_CENTER -> new Point(xLeftToCenter, yBelow);
                case BOTTOM_LEFT_TO_RIGHT -> new Point(xLeftToRight, yBelow);
                case BOTTOM_CENTER_TO_LEFT -> new Point(xCenterToLeft, yBelow);
                case BOTTOM_CENTER_TO_CENTER -> new Point(xCenterToCenter, yBelow);
                case BOTTOM_CENTER_TO_RIGHT -> new Point(xCenterToRight, yBelow);
                case BOTTOM_RIGHT_TO_LEFT -> new Point(xRightToLeft, yBelow);
                case BOTTOM_RIGHT_TO_CENTER -> new Point(xRightToCenter, yBelow);
                case BOTTOM_RIGHT_TO_RIGHT -> new Point(xRightToRight, yBelow);
            };
        }

        private void updatePopupForVisibility() {
            if (isVisible()) {
                pack();
                Point point = getPoint(alignment);
                setLocation(point.x, point.y);
            }
        }
    }

    private class PeriodicScrollPane extends JScrollPane {
        private final boolean hasVerticalScrollBar;
        private final boolean hasHorizontalScrollBar;
        private JPanel cornerPanel;
        private JScrollBar vsb;
        private JScrollBar hsb;

        public PeriodicScrollPane(Component view, int vsbPolicy, int hsbPolicy) {
            super(view, vsbPolicy, hsbPolicy);

            this.hasVerticalScrollBar = vsbPolicy == VERTICAL_SCROLLBAR_ALWAYS || vsbPolicy == VERTICAL_SCROLLBAR_AS_NEEDED;
            this.hasHorizontalScrollBar = hsbPolicy == HORIZONTAL_SCROLLBAR_ALWAYS || hsbPolicy == HORIZONTAL_SCROLLBAR_AS_NEEDED;

            updateScrollBar();
        }

        private BasicScrollBarUI createVerticalUI(int height) {
            return new BasicScrollBarUI() {
                final int FIXED_KNOB_HEIGHT = height;

                @Override
                protected JButton createDecreaseButton(int orientation) {
                    return createZeroButton();
                }

                @Override
                protected JButton createIncreaseButton(int orientation) {
                    return createZeroButton();
                }

                private JButton createZeroButton() {
                    JButton button = new JButton();
                    button.setPreferredSize(new Dimension(0, 0));
                    return button;
                }

                @Override
                protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
                    g.setColor(scrollBarTrackColor);
                    g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
                }

                @Override
                protected void setThumbBounds(int x, int y, int width, int height) {
                    int trackHeight = scrollbar.getHeight();

                    if (height > FIXED_KNOB_HEIGHT) {

                        int maxOriginalY = trackHeight - height;
                        int maxNewY = trackHeight - FIXED_KNOB_HEIGHT;

                        if (maxOriginalY > 0) {
                            double ratio = (double) y / maxOriginalY;
                            y = (int) (ratio * maxNewY);
                        }
                        height = FIXED_KNOB_HEIGHT;
                    }
                    if (scrollbar.getValue() + scrollbar.getModel().getExtent() >= scrollbar.getMaximum()) {
                        y = trackHeight - height;
                    }

                    super.setThumbBounds(x, y, width, height);
                }

                @Override
                protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                    if (isDragging || scrollbar.getValueIsAdjusting())
                        g2.setColor(scrollBarThumbDragColor);
                    else
                        g2.setColor(scrollBarThumbColor);

                    g2.fillRoundRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height,
                                     scrollBarThumbRadius, scrollBarThumbRadius);
                    g2.dispose();
                }

                @Override
                protected void installListeners() {
                    super.installListeners();
                }

                @Override
                protected void scrollByBlock(int direction) {
                    int customStep = 10;
                    int currentVal = scrollbar.getValue();
                    int newValue = currentVal + (direction * customStep);

                    if (newValue < scrollbar.getMinimum()) newValue = scrollbar.getMinimum();
                    int maxScrollable = scrollbar.getMaximum() - scrollbar.getModel().getExtent();
                    if (newValue > maxScrollable) newValue = maxScrollable;
                    scrollbar.setValue(newValue);
                }
            };
        }

        private BasicScrollBarUI createHorizontalUI(int width) {
            return new BasicScrollBarUI() {
                final int FIXED_KNOB_WIDTH = width;

                @Override
                protected JButton createDecreaseButton(int orientation) {
                    return createZeroButton();
                }

                @Override
                protected JButton createIncreaseButton(int orientation) {
                    return createZeroButton();
                }

                private JButton createZeroButton() {
                    JButton button = new JButton();
                    button.setPreferredSize(new Dimension(0, 0));
                    button.setMinimumSize(new Dimension(0, 0));
                    button.setMaximumSize(new Dimension(0, 0));
                    return button;
                }

                @Override
                protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
                    g.setColor(scrollBarTrackColor);
                    g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
                }

                @Override
                protected void setThumbBounds(int x, int y, int width, int height) {
                    int trackWidth = scrollbar.getWidth();

                    if (width > FIXED_KNOB_WIDTH) {
                        int maxOriginalX = trackWidth - width;
                        int maxNewX = trackWidth - FIXED_KNOB_WIDTH;

                        if (maxOriginalX > 0) {
                            double ratio = (double) x / maxOriginalX;
                            x = (int) (ratio * maxNewX);
                        }
                        width = FIXED_KNOB_WIDTH;
                    }

                    if (scrollbar.getValue() + scrollbar.getModel().getExtent() >= scrollbar.getMaximum()) {
                        x = trackWidth - width;
                    }

                    super.setThumbBounds(x, y, width, height);
                }

                @Override
                protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                    if (isDragging || scrollbar.getValueIsAdjusting())
                        g2.setColor(scrollBarThumbDragColor);
                    else
                        g2.setColor(scrollBarThumbColor);

                    g2.fillRoundRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height,
                                     scrollBarThumbRadius, scrollBarThumbRadius);
                    g2.dispose();
                }

                @Override
                protected void installListeners() {
                    super.installListeners();
                }

                @Override
                protected void scrollByBlock(int direction) {
                    int customStep = 10;
                    int currentVal = scrollbar.getValue();
                    int newValue = currentVal + (direction * customStep);

                    if (newValue < scrollbar.getMinimum()) newValue = scrollbar.getMinimum();
                    int maxScrollable = scrollbar.getMaximum() - scrollbar.getModel().getExtent();
                    if (newValue > maxScrollable) newValue = maxScrollable;
                    scrollbar.setValue(newValue);
                }
            };
        }

        private void updateScrollBar() {
            setBorder(new EmptyBorder(0, 0, 0, 0));
            setOpaque(false);
            getViewport().setOpaque(false);

            if (hasVerticalScrollBar) {
                vsb = getVerticalScrollBar();
                vsb.setPreferredSize(new Dimension(10, 0));
                vsb.setOpaque(false);
                vsb.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseEntered(java.awt.event.MouseEvent e) {
                        vsb.repaint();
                    }

                    @Override
                    public void mouseExited(java.awt.event.MouseEvent e) {
                        vsb.repaint();
                    }
                });
                vsb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    @Override
                    public void mouseMoved(java.awt.event.MouseEvent e) {
                        vsb.repaint();
                    }
                });
                vsb.setUI(createVerticalUI(scrollBarVerticalKnobHeight));

                setWheelScrollingEnabled(false);
                addMouseWheelListener(e -> {
                    int scrollSpeedModifier = 5;
                    int moveAmount = e.getWheelRotation() * scrollSpeedModifier;

                    vsb.setValue(vsb.getValue() + moveAmount);
                });
            }

            if (hasHorizontalScrollBar) {
                hsb = getHorizontalScrollBar();
                hsb.setPreferredSize(new Dimension(0, 12));

                hsb.setOpaque(false);
                hsb.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseEntered(java.awt.event.MouseEvent e) {
                        hsb.repaint();
                    }

                    @Override
                    public void mouseExited(java.awt.event.MouseEvent e) {
                        hsb.repaint();
                    }
                });
                hsb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    @Override
                    public void mouseMoved(java.awt.event.MouseEvent e) {
                        hsb.repaint();
                    }
                });

                hsb.setUI(createHorizontalUI(scrollBarHorizontalKnobWidth));
            }

            if (hasVerticalScrollBar && hasHorizontalScrollBar) {
                cornerPanel = new JPanel();
                cornerPanel.setBackground(scrollBarCornerColor);
                setCorner(JScrollPane.LOWER_RIGHT_CORNER, cornerPanel);
            }

            if (hasVerticalScrollBar || hasHorizontalScrollBar) {
                revalidate();
                repaint();
            }
        }

        private void setCornerColor(Color cornerColor) {
            Objects.requireNonNull(cornerColor, "CornerColor cannot be null.");
            if (!hasVerticalScrollBar || !hasHorizontalScrollBar)
                throw new IllegalArgumentException("Corner Panel is available when both scroll bars enabled. Check for the vsbPolicy and hsbPolicy.");
            cornerPanel.setBackground(cornerColor);
            this.revalidate();
            this.repaint();
        }

        private void setVerticalKnobHeight(int verticalKnobHeight) {
            if (!hasVerticalScrollBar)
                throw new IllegalArgumentException("VerticalScrollBar is null. Check for the vsbPolicy.");
            vsb.setUI(createVerticalUI(verticalKnobHeight));
            vsb.revalidate();
            vsb.repaint();
            this.revalidate();
            this.repaint();
        }

        private void setHorizontalKnobWidth(int horizontalKnobWidth) {
            if (!hasHorizontalScrollBar)
                throw new IllegalArgumentException("HorizontalScrollBar is null. Check for the hsbPolicy.");
            hsb.setUI(createHorizontalUI(horizontalKnobWidth));
            hsb.revalidate();
            hsb.repaint();
            this.revalidate();
            this.repaint();
        }
    }
}